package com.mainpackage.maze;

public enum CompassPoint {

	NORTH (0) , 
	EAST (1) , 
	SOUTH (2) , 
	WEST(3) ;
	
	private final int value;
    private CompassPoint(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
