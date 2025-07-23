package com.chardatatypeexercise;

public class ValuesOfChar {

	public static void main(String[] args) {
		ValuesOfChar.valuesOfLowerCaseAlphabet();
		ValuesOfChar.valuesOfUpperCaseAlphabet();
		ValuesOfChar.valuesOfDigits();
	}

	public static void valuesOfLowerCaseAlphabet() {
		int valueOfa = 'a';
		int valueOfz = 'z';
		System.out.println("Value of a is : " + valueOfa); // 97
		System.out.println("Value of z is : " + valueOfz); // 122
	}

	public static void valuesOfUpperCaseAlphabet() {
		int valueOfA = 'A';
		int valueOfZ = 'Z';
		System.out.println("Value of A is : " + valueOfA); // 65
		System.out.println("Value of Z is : " + valueOfZ); // 90
	}

	public static void valuesOfDigits() {
		int valueOf0 = '0';
		int valueOf9 = '9';
		System.out.println("Value of 0 is : " + valueOf0); // 48
		System.out.println("Value of 9 is : " + valueOf9); // 57
	}

}
