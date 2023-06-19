package Activity3;

import java.util.Scanner;

public class Activity19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);
		 System.out.println("Enter the current year : ");
		 int currentYear = kb.nextInt();
		 System.out.println("Enter the joined year : ");
		 int joinedYear = kb.nextInt();
		 int yearsOfService = currentYear - joinedYear;
		 
		 if (yearsOfService > 3) {
			 System.out.println("Your are eligible for a bonus of Rs. 2500");
		 } 		 
		 kb.close();
		 
		 
		 

	}

}
