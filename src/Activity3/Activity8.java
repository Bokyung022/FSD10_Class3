package Activity3;

import java.util.Scanner;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number of month (1-12)");
		int monthNumber = kb.nextInt();
		
		String monthName;
		
		switch (monthNumber) {
			case 1:
				monthName = "Jan";
				break;
			case 2:
				monthName = "Feb";
				break;
			case 3:
				monthName = "Mar";
				break;
			case 4:
				monthName = "Apr";
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "Jun";
				break;
			case 7:
				monthName = "Jul";
				break;
			case 8:
				monthName = "Aug";
				break;
			case 9:
				monthName = "Sep";
				break;
			case 10:
				monthName = "Oct";
				break;
			case 11:
				monthName = "Nov";
				break;
			case 12:
				monthName = "Dec";
				break;
			default : 
				monthName = "Invalid month number";
		}
		
		System.out.println("The name of month is " + monthName);
		kb.close();
		

	}

}
