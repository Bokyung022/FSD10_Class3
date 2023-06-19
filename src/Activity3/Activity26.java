package Activity3;

import java.util.Scanner;

public class Activity26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);
		
        System.out.println("Enter the number: ");
		int number = kb.nextInt();
		
		int absoluteNumber = Math.abs(number);
		
		System.out.println("The absolute number is " + absoluteNumber);
		kb.close();
	}

}
