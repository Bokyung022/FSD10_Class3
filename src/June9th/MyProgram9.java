package June9th;

import java.util.Scanner;

public class MyProgram9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 swith() {
		 case 1: Whatever;
		 break;
		 case 2: Another thing...;
		 break;
		 }
		 */
		
		int monthNum;
		String monthName;
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me a number of any month");
		monthNum = kb.nextInt();
		
		switch(monthNum) {
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
			default:
				monthName = "There is no such a thing";
				break;
		}

		System.out.println("You entered " + monthName);
	}

}
