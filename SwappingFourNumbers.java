package com.assignments.swapping;

public class SwappingFourNumbers {

	public static void main(String[] args) {
		int firstNumber = 100, secondNumber = 200, thirdNumber=300, fourthNumber=400;
		int temp = 0;

		System.out.println("Before swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber+"\t"+"ThirdNumber: "+ thirdNumber+"\t"+"FourthNumber: "+ fourthNumber );
	
		temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=thirdNumber;
		thirdNumber=fourthNumber;
		fourthNumber=temp;
		
		System.out.println("After swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber+"\t"+"ThirdNumber: "+ thirdNumber+"\t"+"FourthNumber: "+ fourthNumber );

	}

}
