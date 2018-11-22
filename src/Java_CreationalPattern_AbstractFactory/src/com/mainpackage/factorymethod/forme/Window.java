package com.mainpackage.factorymethod.forme;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window extends JFrame {

	private JPanel panel  ; 
	public Window () 
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setPreferredSize(new Dimension(800, 600 ));
		this.setVisible(true); 
		panel = new JPanel() ; 
		this.add(panel ) ; 
		panel.setBackground(Color.CYAN);
		this.pack(); 
		
	}
	
	
	
	public JPanel getPanel () 
	{
		return panel ;
	}
}
