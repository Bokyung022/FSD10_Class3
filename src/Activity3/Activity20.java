package Activity3;

import java.util.Scanner;

public class Activity20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your basic salary: ");
		int basicSalary = kb.nextInt();
		
		double hra, da;
		
		if (basicSalary < 1500) {
			hra = basicSalary * 0.1;
			da = basicSalary * 0.9;
		} else {
			hra = 500;
			da = basicSalary * 0.98;
		}
		
		double grossSalary = basicSalary + hra + da;
		System.out.println("Your gross salary is: " + grossSalary);
		kb.close();

	}

}
