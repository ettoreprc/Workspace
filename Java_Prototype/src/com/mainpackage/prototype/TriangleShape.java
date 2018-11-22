package com.mainpackage.prototype;

public class TriangleShape extends AbstractShape {

	private int base;
	private int height;

	public TriangleShape(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		return (TriangleShape) super.clone();

	}

	public void print() {
		int numberoflayer = this.height, Space, Number;
		for (int i = 1; i <= numberoflayer; i++) // Total number of layer for pramid
		{
			for (Space = 1; Space <= (numberoflayer - i); Space++) // Loop For Space
				System.out.print(" ");
			for (Number = 1; Number <= i; Number++) // increase the value
				System.out.print("*");
			for (Number = (i - 1); Number >= 1; Number--) // decrease the value
				System.out.print("*");
			System.out.println();
		}
	}
}
