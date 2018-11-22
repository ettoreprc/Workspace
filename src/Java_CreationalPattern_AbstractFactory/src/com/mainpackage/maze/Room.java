package com.mainpackage.maze;

import java.util.ArrayList;

import com.mainpackage.maze.CompassPoint;

public class Room {

	private boolean [] myside = new boolean [4] ; 
	private Wall [] walls  = new Wall [4] ;
	private Door [] doors = new Door [4] ; 
	
	private int n;

	public Room(int n) {
		this.n = n;
		for (int i = 0 ; i < 4; i++ ) 
			myside[i] = false ; 
	}
	
	public void setSide (CompassPoint cp  , Wall w  )  
	{
		myside [cp.getValue()] = true  ; 
		walls [cp.getValue()] = w ; 
	}

	public void setSide (CompassPoint cp  , Door d )  
	{
		myside [cp.getValue()] = true  ; 
		doors [cp.getValue()] = d ; 
	}
}
