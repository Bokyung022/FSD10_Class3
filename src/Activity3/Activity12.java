package Activity3;

import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner kb = new Scanner(System.in);
		
		System.out.println ("Enter the first side");
		int side1 = kb.nextInt();
		System.out.println ("Enter the second side");
		int side2 = kb.nextInt();
		System.out.println ("Enter the third side");
		int side3 = kb.nextInt();
		
		if(side1 == side2 && side2 == side3) {
			System.out.println ("Triangle is Equilateral.");
		} else if (side1 == side2 || side2 == side3 || side3 == side1 ) {
			System.out.println ("Triangle is Isosceles.");
		} else {
			System.out.println ("Triangle is Scalene.");
		}
		kb.close();

	}

}
