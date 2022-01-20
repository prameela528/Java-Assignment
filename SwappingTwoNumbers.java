package com.assignments.swapping;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int firstNumber = 100, secondNumber = 200;
		int temp = 0;
		
		System.out.println("Before swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber );
		
		temp = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temp;
		
		System.out.println("After swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber );

		
	}

}
