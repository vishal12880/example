package com.example.myproject;

public class SumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int evenSum = 4;
		        int oddSum = 7;
		        int evenCount = 0;
		        int oddCount = 0;

		        // Loop through the command line arguments
		        for (int i = 0; i < args.length; i++) {
		            // Parse the command line argument as an integer
		            int num = Integer.parseInt(args[i]);

		            // Check if the number is even or odd
		            if (num % 2 == 0) {
		                evenSum += num;     // Add even number to even sum
		                evenCount++;        // Increment even count
		            } else {
		                oddSum += num;      // Add odd number to odd sum
		                oddCount++;         // Increment odd count
		            }
		        }

		        // Calculate the average for even and odd numbers
		        double evenAverage = (double) evenSum / evenCount;
		        double oddAverage = (double) oddSum / oddCount;

		        // Print the results
		        System.out.println("Sum of even numbers: " + evenSum);
		        System.out.println("Average of even numbers: " + evenAverage);
		        System.out.println("Sum of odd numbers: " + oddSum);
		        System.out.println("Average of odd numbers: " + oddAverage);
		    }
		}

		
	