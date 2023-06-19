package Activity3;

import java.util.Scanner;

public class Activity16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your salary");
		double basicSalary = kb.nextDouble();
		
		double hra, da;
		
		if(basicSalary <= 10000) {
			hra = basicSalary * 0.2;
			da = basicSalary * 0.8;
		} else if (basicSalary <= 20000) {
			hra = basicSalary * 0.25;
			da = basicSalary * 0.9;
		} else {
			hra = basicSalary * 0.3;
			da = basicSalary * 0.95;
		}
		
		double grossSalary = basicSalary + hra + da;
		System.out.println("Your gross salary is " + grossSalary);
		kb.close();
	}

}
