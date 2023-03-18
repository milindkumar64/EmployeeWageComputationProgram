package com.bridgelabz.uctwo;

import java.util.Random;

public class DailyEmployeeWage {

	public static void main(String[] args) {
		
		int empHrs = 0;
		int empWage=0;	
		int EMP_RATE_PER_HOUR=20;
		Random random = new Random();
		Boolean attendance=random.nextBoolean();
		
		if(attendance)
			empHrs=8;
		else
			empHrs=0;
		
		empWage=empHrs*EMP_RATE_PER_HOUR;
		System.out.println("Employee Wage is :"+empWage);
	}

}
