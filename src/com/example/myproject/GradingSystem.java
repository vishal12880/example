package com.example.myproject;

public class GradingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade;

		if (score >= 90) {
		    grade = 'A';
		} else if (score >= 80) {
		    grade = 'B';
		} else if (score >= 70) {
		    grade = 'C';
		} else if (score >= 60) {
		    grade = 'D';
		} else {
		    grade = 'F';
		}

		System.out.println("Your grade is " + grade);

	}

}
