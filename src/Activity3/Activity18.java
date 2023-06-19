package Activity3;

import java.util.Scanner;

public class Activity18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your quantity");
		int quantity = kb.nextInt();
		System.out.println("Enter your price");
		double price = kb.nextDouble();
		
		double totalPrice = quantity * price;
		
		double discount;
		if (quantity > 100) {
			discount = totalPrice * 0.1;
		} else {
			discount = 0;
		}
		
		double totalExpense = totalPrice - discount;
		System.out.println("Your total expense is " + totalExpense);
		kb.close();

	}

}
