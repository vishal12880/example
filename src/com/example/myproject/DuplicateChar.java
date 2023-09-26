package com.example.myproject;

public class DuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String inputString = "shimakh technology".toLowerCase();
		        
		        for (char c = 'a'; c <= 'z'; c++) {
		            int count = inputString.length() - inputString.replace(String.valueOf(c), "").length();
		            if (count > 1) {
		                System.out.println("Duplicate character: " + c);
		            }
		        }
		    }
		}


