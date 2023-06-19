package Activity3;

import java.util.Scanner;

public class Activity23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number of 10000's: ");
		int num1 = kb.nextInt();
		System.out.println("Enter the number of 1000's: ");
		int num2 = kb.nextInt();
		System.out.println("Enter the number of 100's: ");
		int num3 = kb.nextInt();
		System.out.println("Enter the number of 10's: ");
		int num4 = kb.nextInt();
		System.out.println("Enter the number of 1's ");
		int num5 = kb.nextInt();
		
		int number = (num1 * 10000) + (num2 * 1000) + (num3 * 100) + (num4 * 10) + (num5 * 1);
		System.out.println("The number is " + number);
		
		int reversedNumber = (num5 * 10000) + (num4 * 1000) + (num3 * 100) + (num2 * 10) + (num1 * 1);
		System.out.println("The reversed number is " + reversedNumber);
		
		if (number == reversedNumber ) {
			System.out.println("The original and reversed numbers are equal.");
		} else {
			System.out.println("The original and reversed numbers are not equal.");
		}
		kb.close();
	}

}
