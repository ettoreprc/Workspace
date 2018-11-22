package com.mainpackage.shape;

public class Client {
	  public static void main(String[] args) {
	    AbstractFactory shapeFactory = new ShapeFactory();
	    Shape circle = shapeFactory.getShape("circle");
	    circle.draw();
	    Shape rectangle = shapeFactory.getShape("RECTANGLE");
	    rectangle.draw();
	    Shape square = shapeFactory.getShape("SQUARE");
	    square.draw();
	  }
	}