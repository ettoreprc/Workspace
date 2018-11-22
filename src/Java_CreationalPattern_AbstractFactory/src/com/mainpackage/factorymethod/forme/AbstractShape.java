package com.mainpackage.factorymethod.forme;

import java.awt.Image;

public interface AbstractShape {

	public AbstractShape createShape () ;
	public void printSomething (Window w ) ; 
	public Image getImage () ; 
 
	
}
