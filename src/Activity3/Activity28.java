package Activity3;

import java.util.Scanner;

public class Activity28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner kb = new Scanner(System.in);
		
        System.out.println("Enter the hardness of the steel: ");
		int hardness = kb.nextInt();
		
		System.out.println("Enter the carbon content of the steel: ");
		int carbonContent = kb.nextInt();
		
		System.out.println("Enter the tensile strength of the steel: ");
		int tensileStrength = kb.nextInt();
		
		int grade;
		
		if ( hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600 ) {
			grade = 10;
		} else if (hardness > 50 && carbonContent < 0.7 ) {
			grade = 9;
		} else if (carbonContent < 0.7 && tensileStrength > 5600) {
			grade = 8;
		} else if (hardness > 50 && tensileStrength > 5600) {
            grade = 7;
        } else if (hardness > 50 || carbonContent < 0.7 || tensileStrength > 5600) {
            grade = 6;
        } else {
            grade = 5;
        }

        System.out.println("The grade of the steel is: " + grade);
        kb.close();
     }
}
