package Activity3;

import java.util.Scanner;

public class Activity33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int number1 = kb.nextInt();
		
		System.out.println("Enter the second number");
		int number2 = kb.nextInt();
		
		System.out.println("Enter the third number");
		int number3 = kb.nextInt();
		
		if ( number1 < number2 && number2 < number3) {
			System.out.println("Numbers are in increasing.");
		} else if ( number1 > number2 && number2 > number3 ) {
			System.out.println("Numbers are in decreasing.");
		} else {
			System.out.println("Numbers are neither in increasing nor in decreasing.");
		}
		kb.close();

	}

}
