/*
 * Foundational Java
 * Exercise 4.1
 */


package com.introjava.chapter4.examples;

public class OddEvenExample {
	
	public static void main(String[] args) {
		
		// generate a random number in the range 1 to 10
		double randomNumber = Math.random();
		
		randomNumber *= 10;
		randomNumber++;
		
		int roundedNumber =(int)randomNumber;
		
		if(roundedNumber % 2 == 0)
		{
			System.out.println("Number is even");
			System.out.println("roundedNumber was: " + roundedNumber);
		}
		else
		{
			System.out.println("Number is odd");
			System.out.println("roundedNumber was: " + roundedNumber);
		}
		
	}

}
