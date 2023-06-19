package Activity3;

import java.util.Scanner;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please give me a number");
		int number = kb.nextInt();
		
		if (number > 0) {
			System.out.println("The number is positive");
		} else if (number < 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is 0");
		}
		kb.close();

	}

}
