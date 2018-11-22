package myimplementation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


import sun.misc.Signal;

public class VisitorGUI extends JFrame {

	private JPanel mainPanel;
	private JPanel rightPanel  ;
	private JPanel leftPanel ; 
	private BorderLayout layout = new BorderLayout() ; 
	private JButton buttonA = new JButton("Liquor") ;
	private JButton buttonB = new JButton("Necessity") ;
	private JButton buttonC = new JButton("Tobacco") ;

	TaxVisitor taxCalc = new TaxVisitor();
	TaxHolidayVisitor taxHolidayCalc = new TaxHolidayVisitor();
	
	Necessity milk = new Necessity("3.47");
	Liquor vodka = new Liquor("11.99");
	Tobacco cigars = new Tobacco("19.99");

	
	public VisitorGUI() {
		setFrame();
		setMainPanel();
		setRightPanel() ;
		setLeftPanel()  ;
		setFunctionButton() ;
	}

	private void setRightPanel() {
		rightPanel = new JPanel() ;
		rightPanel.setPreferredSize(new Dimension(300, 600));
		rightPanel.setBackground(new Color(135, 100, 141));
		rightPanel.setLayout(new BoxLayout(rightPanel, BoxLayout.Y_AXIS));
		rightPanel.add(buttonA) ; 
		buttonA.setAlignmentX(CENTER_ALIGNMENT);
		rightPanel.add(buttonB) ;
		buttonB.setAlignmentX(CENTER_ALIGNMENT);
		rightPanel.add(buttonC) ;
		buttonC.setAlignmentX(CENTER_ALIGNMENT);
		
		mainPanel.add(rightPanel, layout.EAST);
	}
	
	private void setLeftPanel() {
		leftPanel = new JPanel() ;
		leftPanel.setPreferredSize(new Dimension(500, 600));
		leftPanel.setBackground(Color.LIGHT_GRAY);
		mainPanel.add(leftPanel, layout.WEST);
	}

	private void setMainPanel() {
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(140, 140, 100));
		mainPanel.setLayout(layout);
		this.getContentPane().add(mainPanel);
	}

	private void setFrame() {
		this.setPreferredSize(new Dimension(800, 600));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Visitor Exercise");
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
	} 
	
	private void setFunctionButton () 
	{
		buttonA.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed A");
//				leftPanel.removeAll();
//				leftPanel.repaint();
				leftPanel.getGraphics().clearRect(0, 0, leftPanel.getWidth(), leftPanel.getHeight());
				leftPanel.getGraphics().setColor(Color.BLACK);
				leftPanel.getGraphics().drawString(milk.accept(taxCalc), 1, 300);
			}
		});
		buttonB.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed B");
//				leftPanel.removeAll();
//				leftPanel.repaint();
				leftPanel.getGraphics().clearRect(0, 0, leftPanel.getWidth(), leftPanel.getHeight());
				leftPanel.setBackground(Color.WHITE);

				leftPanel.getGraphics().setColor(Color.BLACK);
				leftPanel.getGraphics().drawString(vodka.accept(taxCalc), 1, 300);

			}
		});
		buttonC.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("pressed C");
//				leftPanel.removeAll();
//				leftPanel.repaint();
				leftPanel.getGraphics().clearRect(0, 0, leftPanel.getWidth(), leftPanel.getHeight());
				leftPanel.setBackground(Color.WHITE);

				leftPanel.getGraphics().setColor(Color.BLACK);
				leftPanel.getGraphics().drawString(cigars.accept(taxCalc), 1, 300);

			}
		});
		
	}

	public static void main(String[] args) {
		VisitorGUI gui = new VisitorGUI();
	}
}
