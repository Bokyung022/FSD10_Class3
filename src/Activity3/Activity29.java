package Activity3;

import java.util.Scanner;

public class Activity29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How many days late?");
		int lateDay = kb.nextInt();
		
		if ( lateDay <= 5) {
			System.out.println("Your fine is 50 paise.");
		} else if ( lateDay <=10 ) {
			System.out.println("Your fine is 1 rupee.");
		} else if ( lateDay <= 30) {
			System.out.println("Your fine is 5 rupee.");
		} else {
			System.out.println("Your membership will be cancelled");
		} 
		kb.close();
	}

}
