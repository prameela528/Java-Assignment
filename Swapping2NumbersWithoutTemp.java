package com.assignments.swapping;

public class Swapping2NumbersWithoutTemp {

	public static void main(String[] args) {
		int firstNumber = 100, secondNumber = 200;
		
		System.out.println("Before swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber );
		
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		
		System.out.println("After swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber );

		
	}

}
