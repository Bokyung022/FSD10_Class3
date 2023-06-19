package Activity3;

import java.util.Scanner;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = kb.nextInt();
		
		if (number % 5 ==0 && number % 11 == 0) {
			System.out.println("The number is divisible by both 5 and 11.");
		} else {
			System.out.println("The number is not divisible by both 5 and 11.");
		} 
		kb.close();

	}

}
