package com.assignments.swapping;

public class SarathFinalAmount {

	public static void main(String[] args) {

		double amount=500000;
		double time=5;
		double rateOfInterest=6.8;
		
		double interestAmount=(amount*time*rateOfInterest)/100;
		
		System.out.println("Interest Amount: "+ interestAmount );
		
		double finalAmount= amount+interestAmount;
		
		System.out.println("Final Amount of Sarath: "+ finalAmount);
	}

}
