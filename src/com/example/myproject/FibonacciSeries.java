package com.example.myproject;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        int n = 10; // Change 'n' to the desired number of Fibonacci numbers
		        int[] fibonacci = new int[n];
		        
		        fibonacci[0] = 0;
		        fibonacci[1] = 1;

		        for (int i = 2; i < n; i++) {
		            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		        }

		        for (int i = 0; i < n; i++) {
		            System.out.print(fibonacci[i] + " ");
		        }
		    }
		}
