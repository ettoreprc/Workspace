package mainpackage.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;

import mainpackage.decorator.Consumation;

public class Window extends JFrame {

	private ButtonPanel buttonpanel;
	private DrawPanel drawpanel;

	public Window() {
		buttonpanel = new ButtonPanel();
		drawpanel = new DrawPanel();
		this.setPreferredSize(new Dimension(800, 600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
		this.pack();
		this.add(buttonpanel, BorderLayout.EAST);
		this.add(drawpanel, BorderLayout.WEST);
	}

}
