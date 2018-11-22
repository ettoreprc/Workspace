package com.mainpackage.maze;

public abstract class MazeFactory {

	public MazeFactory() {
	}

	public final Maze makeMaze() {
		return new Maze();
	}

	public final Wall makeWall() {
		return new Wall();
	}

	public final Room makeRoom(int n) {
		return new Room(n);
	}

	public final Door makeDoor(Room r1, Room r2) {
		return new Door(r1, r2);
	}

}
