package June9th;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int MIN_AGE = 18;
		Scanner kb = new Scanner(System.in);
		System.out.println("Please give me your age");
		int age = kb.nextInt();
		
		if(age < MIN_AGE) {
			System.out.println("Sorry you are not in legal age");
		}else {
			System.out.println("You can buy this item");
		}
		System.out.println("End of prog");
		
		kb.close();

	}

}
