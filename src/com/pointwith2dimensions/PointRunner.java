package com.pointwith2dimensions;

public class PointRunner {

	public static void main(String[] args) {

		Point xy = new Point(5, 6);
		xy.move(4, 8);
		xy.distanceTo(xy);
	}

}
