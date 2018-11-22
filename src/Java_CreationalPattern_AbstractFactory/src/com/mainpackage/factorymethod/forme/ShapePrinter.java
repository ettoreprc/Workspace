package com.mainpackage.factorymethod.forme;

import javax.swing.JOptionPane;

public class ShapePrinter {

	public Circle makeCircle () 
	{
		return new Circle () ; 
	}
	public Square makeSquare () 
	{
		return new Square() ; 
	}
	public Triangle makeTriangle() 
	{
		return new Triangle () ; 
	}
	
	public void run () 
	{
		String choice = null ; 
		AbstractShape shape ; 
		Window w = new Window() ; 
		while (true)
		{
			if (choice != null )
			{
				if (choice.equalsIgnoreCase("triangle"))
				{
					shape = makeTriangle () ; 
					shape.printSomething(w);
				}
				else if (choice.equalsIgnoreCase("circle") )
				{
					shape = makeCircle () ; 
					shape.printSomething(w);
				}
				else if (choice.equalsIgnoreCase("square") ) 
				{
					shape = makeSquare ()  ;
					shape.printSomething(w);
				}
				else 
					break ; 
			}
			
			choice = JOptionPane.showInputDialog
			("Choose typing the shape to print \nbeetween :\n Circle \nTriangle \nSqaure") ; 
		}
	}
	
	public static void main(String[] args) {
		ShapePrinter sp = new ShapePrinter() ; 
		sp.run(); 
	}
}
