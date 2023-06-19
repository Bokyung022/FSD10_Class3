package Activity3;

import java.util.Scanner;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner kb = new Scanner(System.in);
		
		System.out.println ("Enter the first side");
		int side1 = kb.nextInt();
		System.out.println ("Enter the second side");
		int side2 = kb.nextInt();
		System.out.println ("Enter the third side");
		int side3 = kb.nextInt();
		
		if(side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
			System.out.println ("Triangle is valid.");
		} else {
			System.out.println ("Triangle is not valid.");
		}
		kb.close();

	}

}
