package com.example.myproject;

import java.io.IOException;

public class VowelOrConsonant {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 char ch;

	        
	        System.out.print("Enter a character: ");

	        
	        ch = (char) System.in.read();

	        
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	            System.out.println(ch + " is a vowel.");
	        } else {
	            System.out.println(ch + " is a consonant.");
	        }
	}

}
