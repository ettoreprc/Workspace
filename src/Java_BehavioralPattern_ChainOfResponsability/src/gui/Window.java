package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	private JPanel panel ; 
	private static Window window ; 
	
	private Window () 
	{
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 600));
		initPanel () ; 
		this.setContentPane(panel);
		this.setVisible(true);
		this.pack();
	}
	
	private void initPanel() {
		panel = new JPanel() ; 
		panel.setBackground(new Color(238,180,91));
	}

	public static Window getInstance () 
	{
		if (window == null )
			window = new Window() ; 
		return window ; 
	}
	
	public static void main(String[] args) {
		Window.getInstance() ; 
	}

}
