package Activity3;

import java.util.Scanner;

public class Activity25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first angle: ");
		int firstAngle = kb.nextInt();
		System.out.println("Enter the second angle: ");
		int secondAngle = kb.nextInt();
		System.out.println("Enter the third angle: ");
		int thirdAngle = kb.nextInt();
		
		int sumAngle = firstAngle + secondAngle + thirdAngle;
		
		if (sumAngle == 180) {
			System.out.println("Triangle is valide");
		} else {
			System.out.println("Triangle is not valide");
		}
		
		kb.close();

	}

}
