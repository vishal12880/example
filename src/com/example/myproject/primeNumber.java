package com.example.myproject;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        int start = 1;
		        int end = 50;

		        System.out.println("Prime numbers between " + start + " and " + end + ":");
		        
		        for (int i = start; i <= end; i++) {
		            if (isPrime(i)) {
		                System.out.println(i);
		            }
		        }
		    }

		    
		    public static boolean isPrime(int number) {
		        if (number <= 1) {
		            return false;
		        }
		        
		        
		        for (int i = 2; i <= Math.sqrt(number); i++) {
		            if (number % i == 0) {
		                return false;
		            }
		        }
		        
		        return true; 
		    }
		

	}


