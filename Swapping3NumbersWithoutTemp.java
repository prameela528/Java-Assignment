package com.assignments.swapping;

public class Swapping3NumbersWithoutTemp {

	public static void main(String[] args) {
		int firstNumber = 5, secondNumber = 200, thirdNumber=300;

		System.out.println("Before swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber+"\t"+"ThirdNumber: "+ thirdNumber );
		
		firstNumber=firstNumber+secondNumber+thirdNumber; 
		secondNumber=firstNumber-secondNumber; 
		thirdNumber=secondNumber-thirdNumber;
		secondNumber=secondNumber-thirdNumber; 
		firstNumber=firstNumber-secondNumber-thirdNumber;

		System.out.println("After swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber+"\t"+"ThirdNumber: "+ thirdNumber );


	}

}
