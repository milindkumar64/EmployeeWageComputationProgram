package com.bridgelabz.uceight;

public class WageForMultipleCompany {
	
	int EmpWageBuilder;

	static int calculateEmployeeWage(int RATE_PER_HOUR, int WORKING_DAYS_IN_MONTH, int MAX_HOURS_IN_MONTH ) {
         
	final int IS_PART_TIME = 1;
	final int Full_TIME = 2;
		// variables
		int empHrs = 0;
		int empWage = 20;
		int totalWage = 0;
		int totalHrs = 0;
		int totalDays = 1;

		while (totalDays < WORKING_DAYS_IN_MONTH && totalHrs < MAX_HOURS_IN_MONTH) {
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			totalDays++;
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case Full_TIME:
				empHrs = 8; 	
				break;
			default:
				empHrs = 0;
			}

			totalHrs += empHrs;
			empWage = empHrs * RATE_PER_HOUR;
			totalWage += empWage;
			
		}
		System.out.println("Employee Total Wase is : " + totalWage);
		System.out.println("days" + totalDays);
		System.out.println("totalHrs : " + totalHrs);
		return totalWage;

	}

	public static void main(String[] args) {

		System.out.println("Welcome to First company :");
			
		WageForMultipleCompany firstCom = new WageForMultipleCompany();
		firstCom.EmpWageBuilder = calculateEmployeeWage(20,20,100);
		System.out.println("Welcome to Second company :");
		WageForMultipleCompany secondCom = new WageForMultipleCompany();
		secondCom.EmpWageBuilder = calculateEmployeeWage(30,22,110);
		System.out.println("Welcome to Third company :");
		WageForMultipleCompany thirdCom = new WageForMultipleCompany();
		thirdCom.EmpWageBuilder = calculateEmployeeWage(35,24,120);
		
		
		
	}

}
