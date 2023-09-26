package com.example.myproject;

public class MainClass {
	
	private int nonStaticVar = 10;

    
    private static String staticVar = "Hello vishal raj";

	public static void main(String[] args) {
		MainClass mainObj = new MainClass();
		
		System.out.println("Non-static variable: " + mainObj.nonStaticVar);

        
        System.out.println("Static variable: " + MainClass.staticVar);
        
        SubClass1 sub1 = new SubClass1();
        SubClass2 sub2 = new SubClass2();
        
        sub1.display();
        sub2.display();

	}

}
