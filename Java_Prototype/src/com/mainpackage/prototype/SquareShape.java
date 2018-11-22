package com.mainpackage.prototype;

public class SquareShape extends AbstractShape {

	private static final AbstractShape SquareShape = null;
	private int base, height;

	public SquareShape(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (SquareShape) super.clone();
	}

	public void print() {
		for (int i = 0; i < this.height; i++) {
			for (int j = 0; j < this.base; j++)
				System.out.print("* ");
			System.out.println();
		}

	}
}
