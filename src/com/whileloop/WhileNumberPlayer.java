package com.whileloop;

public class WhileNumberPlayer {

	int limit;

	public WhileNumberPlayer(int limit) {
		this.limit = limit;
	}

	public void printSquareUptoLimit() {
		int i = 1;
		while (i * i <= limit) {
			System.out.println(i * i);
			i++;
		}
	}

	public void printCubeUptoLimit() {
		// TODO Auto-generated method stub

	}

}
