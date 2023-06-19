package Activity3;

import java.util.Scanner;

public class Activity15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your Physics marks");
		int mark1 = kb.nextInt();
		System.out.println("Enter your Chemistry marks");
		int mark2 = kb.nextInt();
		System.out.println("Enter your Biology marks");
		int mark3 = kb.nextInt();
		System.out.println("Enter your Mathematics marks");
		int mark4 = kb.nextInt();
		System.out.println("Enter your Computer marks");
		int mark5 = kb.nextInt();
		
		int totalMark = mark1 + mark2 + mark3 + mark4 + mark5;
        double percentage = (totalMark / 5.0) / 100.0;

        System.out.println("Your percentage: " + (percentage * 100) + "%");

        String grade;

        if (percentage >= 0.9) {
            grade = "A";
        } else if (percentage >= 0.8) {
            grade = "B";
        } else if (percentage >= 0.7) {
            grade = "C";
        } else if (percentage >= 0.6) {
            grade = "D";
        } else if (percentage >= 0.4) {
            grade = "E";
        } else {
            grade = "F";
        }

        System.out.println("Your grade is " + grade);
        kb.close();
	}

}
