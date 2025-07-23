package com.chardatatypeexercise;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new MyChar('1');
		System.out.println(myChar.isVowel());
		System.out.println(myChar.isAlphabet());
		System.out.println(myChar.isDigit());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
