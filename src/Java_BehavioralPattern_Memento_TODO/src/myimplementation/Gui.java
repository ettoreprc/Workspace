package myimplementation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui extends JFrame {

	private JPanel mPanel;
	private BorderLayout layout;
	private JPanel palettePanel;
	private ArrayList<JButton> buttons;
	private BufferedImage christmasTree;
	private BufferedImage redBall;
	private BufferedImage greenBall;
	private BufferedImage bellBall;
	private BufferedImage decoration;
	private BufferedImage undo;
	private BufferedImage redo;
	private BufferedImage currentImage;
	private PrintWriter writer;
	private String name;
	private ArrayList<String> undoList ; //questo mi serve per memorizzare i punti (lo uso al posto del documento di testo ) 

	public Gui() {
		frame();
		mPanel();
		palettePanel();
		loadImages();
		setAssigmentImages();
		mPanel.getGraphics().setColor(Color.BLACK);
		mPanel.getGraphics().drawImage(christmasTree, 250, 50, 300, 400, null);
//		mPanel.getGraphics().drawString("Suca", 400, 300);
		writer = null;
		try {
			writer = new PrintWriter("mementoUndo.txt", "UTF-8");
		} catch (FileNotFoundException exception) {
			exception.printStackTrace();
		} catch (UnsupportedEncodingException exception) {
			exception.printStackTrace();
		}
	}

	private void palettePanel() {
		palettePanel = new JPanel();
		palettePanel.setBackground(Color.RED);
		palettePanel.setPreferredSize(new Dimension(800, 100));
		mPanel.add(palettePanel, layout.SOUTH);
		buttons = new ArrayList<>();
		buttons.add(new JButton("Green Ball"));
		buttons.add(new JButton("Red Ball"));
		buttons.add(new JButton("Decoration"));
		buttons.add(new JButton("Bells"));
		buttons.add(new JButton("Undo"));
		buttons.add(new JButton("Redo"));
		for (JButton jButton : buttons) {
			palettePanel.add(jButton);
		}
	}

	private void mPanel() {
		mPanel = new JPanel();
		layout = new BorderLayout();
		mPanel.setLayout(layout);
		mPanel.setBackground(Color.WHITE);
		this.setContentPane(mPanel);
		mPanel.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("X : " + e.getX() + "\n Y : " + e.getY());
//				undoList.add(e.getX() + " " + e.getY() ) ;
//				undoList.get(undoList.size()) ; 
			}

			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("X : " + e.getX() + "\n Y : " + e.getY());
			}

			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("X : " + e.getX() + "\n Y : " + e.getY());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("X : " + e.getX() + "\n Y : " + e.getY());
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				mPanel.getGraphics().drawImage(currentImage, e.getX(), e.getY(), 50, 50, null);
				writer.println(name + " " + e.getX() + " " + e.getY());
			}
		});
	}

	private void frame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 600));
		this.setVisible(true);
		this.pack();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	private void loadImages() {
		try {
			undo = ImageIO.read(new File(
					"C:\\Users\\Ettor\\eclipse-workspace\\csse120\\Java_BehavioralPattern_Memento_TODO\\mementoImages\\undo.png"));
			redo = ImageIO.read(new File(
					"C:\\Users\\Ettor\\eclipse-workspace\\csse120\\Java_BehavioralPattern_Memento_TODO\\mementoImages\\redo.png"));
			christmasTree = ImageIO.read(new File(
					"C:\\Users\\Ettor\\eclipse-workspace\\csse120\\Java_BehavioralPattern_Memento_TODO\\mementoImages\\treeBase.png"));
			redBall = ImageIO.read(new File(
					"C:\\Users\\Ettor\\eclipse-workspace\\csse120\\Java_BehavioralPattern_Memento_TODO\\mementoImages\\4.png"));
			greenBall = ImageIO.read(new File(
					"C:\\Users\\Ettor\\eclipse-workspace\\csse120\\Java_BehavioralPattern_Memento_TODO\\mementoImages\\1.png"));
			bellBall = ImageIO.read(new File(
					"C:\\Users\\Ettor\\eclipse-workspace\\csse120\\Java_BehavioralPattern_Memento_TODO\\mementoImages\\3.png"));
			decoration = ImageIO.read(new File(
					"C:\\Users\\Ettor\\eclipse-workspace\\csse120\\Java_BehavioralPattern_Memento_TODO\\mementoImages\\2.png"));
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}

	private void setAssigmentImages() {
		buttons.get(0).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentImage = greenBall;
				name = "green";
			}
		});
		buttons.get(1).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentImage = redBall;
				name = "red";
			}
		});
		buttons.get(2).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentImage = decoration;
				name = "decoration";
			}
		});
		buttons.get(3).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				currentImage = bellBall;
				name = "bell";
			}
		});
		
		buttons.get(4).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			      try {
					BufferedReader br = new BufferedReader(new FileReader("mementoUndo.txt"));
				} catch (FileNotFoundException exception) {
					// TODO Auto-generated catch-block stub.
					exception.printStackTrace();
				}
			   

			}
		});

		buttons.get(5).addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				writer.close();
			}
		});
	}

	public static void main(String[] args) {
		Gui gui = new Gui();
	}
}