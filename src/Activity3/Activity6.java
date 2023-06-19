package Activity3;

import java.util.Scanner;

public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the year: ");
		int year = kb.nextInt();
		
		if ( (year % 5 == 0) && (year % 100 != 0) || (year % 400 == 0) ) {
			System.out.println( year + " is leaf year.");
		} else {
			System.out.println(year + " is not a leaf year.");
		}
		kb.close();

	}

}
