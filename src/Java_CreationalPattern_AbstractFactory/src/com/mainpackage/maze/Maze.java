package com.mainpackage.maze;

import java.util.ArrayList;

import com.mainpackage.maze.MazeFactory;

public class Maze {

	ArrayList<Room> rooms ; 
	
	public Maze createMaze (MazeFactory factory )
	{
		rooms = new ArrayList<>() ; 
		Maze aMaze =  factory.makeMaze () ; 
		Room r1 = factory.makeRoom (1)  ;
		Room r2 = factory.makeRoom (2) ;
		Door d1 = factory.makeDoor(r1, r2) ; 
		
		aMaze.addRoom(r1);
		aMaze.addRoom(r2);
		
		r1.setSide(CompassPoint.NORTH, factory.makeWall());
		r1.setSide(CompassPoint.EAST, d1 );
		r1.setSide(CompassPoint.SOUTH, factory.makeWall());
		r1.setSide(CompassPoint.WEST, factory.makeWall());
		
		r2.setSide(CompassPoint.NORTH, factory.makeWall());
		r2.setSide(CompassPoint.EAST, factory.makeWall());
		r2.setSide(CompassPoint.SOUTH, factory.makeWall());
		r2.setSide(CompassPoint.WEST, d1);
		
		return aMaze  ;
	}
	
	public void addRoom (Room room) 
	{
		rooms.add(room) ; 
	}
}
