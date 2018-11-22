package com.mainpackage.prototype;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Interface {
	
	public Interface (Client c ) 
	{
		JFrame frame = new JFrame("Prototype Example");
		JPanel panel = new JPanel();
		frame.setVisible(true);
		frame.setPreferredSize(new Dimension(800, 600));
		frame.add(panel);
		frame.pack();
		panel.setBackground(Color.BLUE);
		JButton triangleButton = new JButton("Triangle");
		JButton squareButton = new JButton("Square");
		triangleButton.setVisible(true);
		squareButton.setVisible(true);
		panel.add(triangleButton);
		panel.add(squareButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		squareButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.callSquare();
			}
			
		});
		triangleButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				c.callTriangle();
			}
		});		
	}
	

}
