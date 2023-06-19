package Activity3;

import java.util.Scanner;

public class Activity21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first subject's marks: ");
		double mark1 = kb.nextDouble();
		System.out.println("Enter your second subject's marks: ");
		double mark2 = kb.nextDouble();
		System.out.println("Enter your third subject's marks: ");
		double mark3 = kb.nextDouble();
		System.out.println("Enter your fourth subject's marks: ");
		double mark4 = kb.nextDouble();
		System.out.println("Enter your fifth subject's marks: ");
		double mark5 = kb.nextDouble();
		
		double totalMark = mark1 + mark2 + mark3 + mark4 + mark5;
		double percentage = (totalMark / 5);
		String division;
		
		if(percentage >= 60) {
			division = "First division";
		} else if (percentage >= 50) {
			division = "Second division";
		} else if (percentage >= 40) {
			division = "Third division";
		} else { division = "fail"; }
		
		System.out.println("Your division is : " + division);
		kb.close();

	}

}
