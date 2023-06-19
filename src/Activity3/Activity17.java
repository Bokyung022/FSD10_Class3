package Activity3;

import java.util.Scanner;

public class Activity17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your electricity unit charges");
		int units = kb.nextInt();
		
		double billAmount;
		
		if(units <= 50) {
			billAmount = units * 0.5;
		} else if (units <= 200) {
			billAmount = 50 * 0.50 + (units - 50) * 0.75;
		} else if (units < 450) {
			billAmount = 50 * 0.50 + 150 * 0.75 + (units - 200) * 1.20;
		} else {
			billAmount = 50 * 0.50 + 150 * 0.75 + 450 * 1.20 + (units - 450) * 1.50;
		}
		
		double surcharge = billAmount * 0.2;
		double totalBillAmount = billAmount + surcharge;
		System.out.println("Your total bill amount is " + totalBillAmount);
		kb.close();

	}

}
