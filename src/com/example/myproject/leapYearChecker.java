package com.example.myproject;

public class leapYearChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2024;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		    System.out.println(year + " is a leap year.");
		} else {
		    System.out.println(year + " is not a leap year.");
		}

	}

}
