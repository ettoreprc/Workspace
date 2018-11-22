package com.mainpackage.factorymethod.forme;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Triangle implements AbstractShape {

	Image image ; 
	@Override
	public AbstractShape createShape() {
		return new Circle () ;
	}

	@Override
	public void printSomething(Window w) {
		System.out.println(getClass().getSimpleName());
		w.getPanel().getGraphics().clearRect(50,50,50,50 );
		w.getPanel().getGraphics().drawImage(getImage() , 50 , 50 , 50 , 50 , null ) ;
	}

	@Override
	public Image getImage() {
		try {
			image = ImageIO.read(new File( "C:\\Users\\Ettor\\Pictures\\shapes\\triangle.png" )); //inserire il path della cartella se no bestemmia male 
		System.err.println("triangle loaded");
		} catch (IOException exception) {
			exception.printStackTrace();
		}	
		return image;
	}

}
