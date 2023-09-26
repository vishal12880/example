package com.example.myproject;

import java.util.Scanner;

public class reversePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int number = input.nextInt();
	        int reversedNumber = reverseNumber(number);

	        System.out.println("Reversed number: " + reversedNumber);
	        
	        input.close();
	    }

	    public static int reverseNumber(int num) {
	        int reversed = 0;
	        while (num != 0) {
	            int digit = num % 10; // Get the last digit
	            reversed = reversed * 10 + digit; // Add the digit to the reversed number
	            num /= 10; // Remove the last digit from the original number
	        }
	        return reversed;
	}

}
