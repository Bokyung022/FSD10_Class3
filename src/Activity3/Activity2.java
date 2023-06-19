package Activity3;

import java.util.Scanner;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please give me first number");
		int number1 = kb.nextInt();
		System.out.println("Please give me second number");
		int number2 = kb.nextInt();
		System.out.println("Please give me third number");
		int number3 = kb.nextInt();
		System.out.println("Please give me fourth number");
		int number4 = kb.nextInt();
		
		int greatestNumber = number1;
		
		if (number2 > greatestNumber) {
			greatestNumber = number2;
		} 
		if (number3 > greatestNumber) {
			greatestNumber = number3;
		} 
		if (number4 > greatestNumber) {
			greatestNumber = number4;
		}
		
		System.out.println("The greatest number is " + greatestNumber);
		kb.close();
	}

}
