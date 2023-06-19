package Activity3;

import java.util.Scanner;

public class Activity31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 = kb.nextInt();
		
		System.out.println("Enter the second number");
		int number2 = kb.nextInt();
		
		System.out.println("Enter the third number");
		int number3 = kb.nextInt();
		
		if (number1 == number2 && number2 == number3) {
			System.out.println("All numbers are equal.");
		} else {
			System.out.println("All numbers are not equal.");
		}
		kb.close();

	}

}
