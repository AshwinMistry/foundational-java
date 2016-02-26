package com.introjava.chapter4.examples;

public class DiceMan {

	public static void main(String[] args) {
		// "throw the dice"
		
		double randomNumber = Math.random();
		randomNumber *= 6;
		randomNumber++;
		int dieValue =(int)randomNumber;
		
		// the die value is used to display an instruction (slightly
		// modified version of the Dice Man's first throw of the
		// die!)
		
		switch (dieValue)
		{
		case 1:
			System.out.println("forget the whole affair " + dieValue);
			break;
		case 2:
			System.out.println("wait until the party on Saturday " + dieValue);
			break;
		case 3:
			System.out.println("do what Arlene says " + dieValue);
			break;
		case 4:
			System.out.println("have a platonic relationship " + dieValue);
			break;
		case 5:
			System.out.println("follow your emotions " + dieValue);
			break;
		case 6:
			System.out.println("go to Arlene’s apartment tonight " + dieValue);
			break;
		}

	}

}
