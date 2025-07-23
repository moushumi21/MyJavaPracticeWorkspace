package com.objectstaticnonstatic;

public class ObjectPractice {

	int x = 55;
	static int y = 66;

	public static void main(String[] args) {
		System.out.println(y);
		ObjectPractice A = new ObjectPractice();
		System.out.println(A.x);
		smethod();
		System.out.println(y);

	}

	public static void smethod() {
		y = 10;
		ObjectPractice B = new ObjectPractice();
		B.x = 35;
		System.out.println(B.x);
	}

	public void nsmethod() {
		ObjectPractice C = new ObjectPractice();
	}
}
