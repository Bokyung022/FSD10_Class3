package June9th;

import java.util.Scanner;

public class MyProgram8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Give me a number");
		int num = kb.nextInt();
		if(num % 2 == 0) {
			System.out.println("Your number is even");
		}else {
			System.out.println("Your number is odd");
		}
		kb.close();

	}

}
