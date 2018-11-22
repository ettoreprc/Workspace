package com.mainpackage.prototype;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client {

	private AbstractShape triangolo;
	private AbstractShape quadrato;

	public static void main(String[] args) {
		Client c = new Client();
		Interface i = new Interface (c) ; 
		c.callSquare();
		c.callTriangle();



	}

	public Client() {

		triangolo = new TriangleShape(10, 20);
		quadrato = new SquareShape(15, 20);

	}

	public void callSquare() {
		try {
			quadrato.clone();
			System.out.println(quadrato.getClass().getSimpleName());
		} catch (Exception e) {
		}
	}

	public void callTriangle() {
		try {
			triangolo.clone();
			System.out.println(triangolo.getClass().getSimpleName());
		} catch (Exception e) {
		}
	}
}
