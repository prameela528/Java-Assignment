package com.assignments.swapping;

public class SwappingThreeNumbers {

	public static void main(String[] args) {
		int firstNumber = 100, secondNumber = 200, thirdNumber=300;
		int temp = 0;

		System.out.println("Before swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber+"\t"+"ThirdNumber: "+ thirdNumber );
	
		//o/p--> fNo=200,sNo=300,tNo=100
		
		temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=thirdNumber;
		thirdNumber=temp;
		
		System.out.println("After swapping");
		System.out.println("FirstNumber: "+ firstNumber+"\t"+"SecondNumber: "+secondNumber+"\t"+"ThirdNumber: "+ thirdNumber );

	}

}
