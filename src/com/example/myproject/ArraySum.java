package com.example.myproject;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2, 4, 6, 8, 10};

        // Initialize a variable to store the sum
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        // Print the sum
        System.out.println("The sum of the array elements is: " + sum);
	}

}
