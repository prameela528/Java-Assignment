package com.assignments.swapping;

public class JioPlanCost {

	public static void main(String[] args) {

		int silverPlanCost = 699;
		float gst = 0.18f;
		float tax = silverPlanCost * gst;

		System.out.println("Tax: " + tax);
		float finalPlanCost = silverPlanCost + tax;

		System.out.println("Final Plan Cost: " + finalPlanCost);
	}

}
