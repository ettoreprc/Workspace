package esercizio;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChatGUI extends JFrame {

	private JPanel home = new JPanel();;
	private JPanel publicChat = new JPanel();
	private JPanel privateChat = new JPanel();
	
	private JButton showPublic = new JButton("Show Public Chat");
	private JButton showPrivate = new JButton("Show Private Chat");

	private CardLayout cl = new CardLayout();
	private BorderLayout bl = new BorderLayout() ;
	
	private Dimension dim = new Dimension(800, 600	) ;
	private Dimension dimButton = new Dimension(200, 100 ) ;
			
	private ArrayList<User> users = new ArrayList<>();

	public ChatGUI() {
		initFrame();
		initHome();
		initButtons();
//		initPrivateChat();
//		initPublicChat();
	}

	private void initFrame() {
		this.setTitle("Chat Room");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(dim);
		this.setVisible(true);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setContentPane(home);
	}
	
	
	private void initHome() {
		home.setBackground(new Color(104, 128, 164));
		home.add(showPrivate , BorderLayout.SOUTH);
		home.add(showPublic, BorderLayout.SOUTH);
	}
	
	private void initPrivateChat() {
		privateChat.setBackground(new Color(164, 104, 162));
		home.add(privateChat, "private");
	}

	private void initPublicChat() {
		publicChat.setBackground(new Color(184, 134, 162));
		home.add(publicChat, "public");
	}

	private void initButtons() {
		showPublic.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				home.setLayout(cl);
				cl.show(publicChat, "public");
			}
		});
		
		showPrivate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				home.setLayout(cl);
				cl.show(privateChat, "private");
			}
		});
	}

	// Main Test
	public static void main(String[] args) {
		ChatGUI g = new ChatGUI();
	}
}
