package Activity3;

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double carrotPrice = 2.0;
		double onionPrice = 4.0;
		double meatPrice = 10.0;
		
        Scanner kb = new Scanner(System.in);
		
		System.out.println("How many carrots do you need? (in lbs)");
		double carrotQuantity = kb.nextDouble();
		System.out.println("How many onions do you need? (in lbs)");
		double onionQuantity = kb.nextDouble();
		System.out.println("How many meats do you need? (in lbs)");
		double meatQuantity = kb.nextDouble();
		
		double totalCost = (carrotPrice * carrotQuantity) + (onionPrice * onionQuantity) + (meatPrice * meatQuantity);
		 
		System.out.println("How do you want to pay, card or cash?");
		String payMethod = kb.next();
		
		if (payMethod.equalsIgnoreCase("card")) {
			double tax = totalCost * 0.13;
			totalCost = totalCost + tax;
		}
		
		System.out.println("Total amount is: $" + totalCost);
		kb.close();
				
	}

}
