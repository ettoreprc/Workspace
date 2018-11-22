package esercitazione.pattern.facade;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Facade {

	JFrame frame ; 
	JPanel panel ; 
	
	public Facade () {
		frame = new JFrame() ; 
		panel = new JPanel() ; 
		frame.add(panel) ; 
	}
	
	public void show() 
	{
		frame.setVisible(true); 
		frame.setPreferredSize(new Dimension(800, 600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		panel.setBackground(Color.BLUE);
	}
	
}
