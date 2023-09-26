package com.example.myproject;

public class MaximumofThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 25, num2 = 42, num3 = 18;
		int max;

		if (num1 >= num2 && num1 >= num3) {
		    max = num1;
		} else if (num2 >= num1 && num2 >= num3) {
		    max = num2;
		} else {
		    max = num3;
		}

		System.out.println("The maximum number is " + max);

	}

}
