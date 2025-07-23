package com.pointwith2dimensions;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void move(int dx, int dy) {
		x = x + dx;
		y = y + dy;
		System.out.println("The new point is: (" + x + "," + y + ")");
	}

	public double distanceTo(Point other) {
		System.out.println(other.x);
		System.out.println(this.x);
		int diffX = (this.x - other.x);
		System.out.println(diffX);
		int diffY = (this.x - other.y);
		double distance = Math.sqrt((diffX * diffX) + (diffY * diffY));
		System.out.println("The distacnce between the points is: " + distance);
		return distance;

	}
}
