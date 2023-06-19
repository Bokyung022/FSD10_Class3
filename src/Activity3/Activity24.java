package Activity3;

import java.util.Scanner;

public class Activity24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the age of Ram: ");
		int ramAge = kb.nextInt();
		System.out.println("Enter the age of Shyam: ");
		int shyamAge = kb.nextInt();
		System.out.println("Enter the age of Ajay: ");
		int AjayAge = kb.nextInt();
		
		String youngestPerson;
		if (ramAge < shyamAge && ramAge < AjayAge) {
			youngestPerson = "Ram"; 
		} else if (shyamAge < ramAge && shyamAge < AjayAge ) {
			youngestPerson = "Shyam";
		} else {
			youngestPerson = "Ajay";
		}
		System.out.println("The youngest person is: " + youngestPerson);
		kb.close();
		

	}

}
