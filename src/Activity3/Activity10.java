package Activity3;

import java.util.Scanner;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println ("Enter the first angle");
		int angle1 = kb.nextInt();
		System.out.println ("Enter the second angle");
		int angle2 = kb.nextInt();
		System.out.println ("Enter the third angle");
		int angle3 = kb.nextInt();
		
		if(angle1 + angle2 + angle3 == 180) {
			System.out.println ("Triangle is valid.");
		} else {
			System.out.println ("Triangle is not valid.");
		}
		kb.close();
		
	}
}
