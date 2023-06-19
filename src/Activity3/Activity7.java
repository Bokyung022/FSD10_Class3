package Activity3;

import java.util.Scanner;

public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);

		System.out.println("Enter the week number (1-7): ");
		int weekNumber = kb.nextInt();

		String weekday;

		switch (weekNumber) {
			case 1: 
				weekday = "Monday";
				break;
			case 2: 
				weekday = "Tuesday";
				break;
			case 3: 
				weekday = "Wednesday";
				break;
			case 4: 
				weekday = "Thursday";
				break;
			case 5: 
				weekday = "Friday";
				break;
			case 6: 
				weekday = "Saturday";
				break;
			case 7: 
				weekday = "Sunday";
				break;
			default:
				weekday = "Invalid week number";
		} 
		
		System.out.println("The weekday is " + weekday);
		kb.close();

	}

}
