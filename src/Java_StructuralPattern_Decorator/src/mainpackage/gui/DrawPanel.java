package mainpackage.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel{

	public DrawPanel() {
		this.setBackground(Color.BLUE);
		this.setPreferredSize(new Dimension(500, 500));
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//stampadati() ; 
		
		
	}
	
}
