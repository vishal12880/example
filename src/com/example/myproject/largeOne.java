package com.example.myproject;

import java.util.Scanner;

public class largeOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the first number: ");
	        int num1 = scanner.nextInt();
	        
	        System.out.print("Enter the second number: ");
	        int num2 = scanner.nextInt();
	        
	        int largest = (num1 > num2) ? num1 : num2;
	        
	        System.out.println("The largest number is: " + largest);
	        
	        scanner.close();
	    }
	}
		       
	
