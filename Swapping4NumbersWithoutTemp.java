package com.assignments.swapping;

public class Swapping4NumbersWithoutTemp {

	public static void main(String[] args) {
		int firstNumber = 100, secondNumber = 200, thirdNumber=300, fourthNumber=400;

		System.out.println("Before swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber+"\t"+"ThirdNumber: "+ thirdNumber+"\t"+"FourthNumber: "+ fourthNumber );
	
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		secondNumber=secondNumber+thirdNumber;
		thirdNumber=secondNumber-thirdNumber;
		secondNumber=secondNumber-thirdNumber;
		fourthNumber=fourthNumber+thirdNumber;
		thirdNumber=fourthNumber-thirdNumber;
		fourthNumber=fourthNumber-thirdNumber;

		System.out.println("After swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber+"\t"+"ThirdNumber: "+ thirdNumber+"\t"+"FourthNumber: "+ fourthNumber );

	}

}
