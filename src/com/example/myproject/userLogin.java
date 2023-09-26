package com.example.myproject;

public class userLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "user123";
		String password = "secret123";

		// Simulated user input
		String inputUsername = "user123";
		String inputPassword = "wrongpass";

		if (inputUsername.equals(username) && inputPassword.equals(password)) {
		    System.out.println("Login successful. Welcome, " + username + "!");
		} else {
		    System.out.println("Login failed. Please check your credentials.");
		}

	}

}
