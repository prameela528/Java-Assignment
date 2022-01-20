package com.assignments.swapping;

public class PizzaBill {

	public static void main(String[] args) {

		double CostOfOnePizza=399.0;
		
		double CostOfTwoPizzas=2*CostOfOnePizza;
		
		System.out.println("Cost of Two Pizzas: "+ CostOfTwoPizzas);
		
		double discount= CostOfTwoPizzas*0.2;
		System.out.println("Discount: "+discount);
		
		double finalBill=CostOfTwoPizzas-discount;
		System.out.println("Final Bill:"+finalBill );
	}

}
