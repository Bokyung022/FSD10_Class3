package Activity3;

import java.util.Scanner;

public class Activity30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);
		
		System.out.println("How many time required?");
		int time = kb.nextInt();
		
		if ( time >= 2 && time < 3 ) {
			System.out.println("You are highly efficient.");
		} else if ( time >= 3 && time < 4 ) {
			System.out.println("You are ordered to improve speed.");
		} else if ( time >= 4 && time < 5 ) {
			System.out.println("You are given traning to imrove your speed.");
		} else {
			System.out.println("You have to leave the company.");
		} 
		kb.close();

	}

}
