package Activity3;

import java.util.Scanner;

public class Activity14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

        System.out.print("Enter the cost price: $");
        double costPrice = kb.nextDouble();

        System.out.print("Enter the selling price: $");
        double sellingPrice = kb.nextDouble();

        double profit = sellingPrice - costPrice;

        if (profit > 0) {
            System.out.println("Profit amount: $" + profit);
        } else if (profit < 0) {
            double loss = Math.abs(profit);
            System.out.println("Loss amount: $" + loss);
        } else {
            System.out.println("No profit or loss.");
        }
       kb.close();
	}

}
