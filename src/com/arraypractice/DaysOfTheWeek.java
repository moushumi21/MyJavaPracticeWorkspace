package com.arraypractice;

public class DaysOfTheWeek {

	static String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };

	public static void main(String[] args) {
		longestString(daysOfWeek);
	}

	public DaysOfTheWeek(String[] daysOfWeek) {
		this.daysOfWeek = daysOfWeek;
	}

	public static void longestString(String[] daysOfWeek) {
		String longestDay = "";
		for (String days : daysOfWeek) {
			if (days.length() > longestDay.length()) {
				longestDay = days;
			}
		}
		System.out.println(longestDay);
	}

}
//sending to github
