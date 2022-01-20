package com.assignments.swapping;

public class HimaGrossAndNetAmount {

	public static void main(String[] args) {

		double basicSal = 85000;
		double ta = 0.15 * basicSal;
		double da = 0.2 * basicSal;
		double hra = 0.18 * basicSal;

		double pf = 0.2 * basicSal;
		double tax = 0.25 * basicSal;

		double grossAmount = basicSal + ta + da + hra;
		double netAmount = grossAmount - (pf + tax);
		
		System.out.println("Gross Amount: "+ grossAmount);
		System.out.println("Net Amount: "+ netAmount);
	}

}
