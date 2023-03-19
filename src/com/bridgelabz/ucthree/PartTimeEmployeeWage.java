package com.bridgelabz.ucthree;

import java.util.Random;

public class PartTimeEmployeeWage {

	public static void main(String[] args) {
		//Constants
	   final int PART_TIME= 1;
	   final int Full_TIME=2;
	   final int RATE_PER_HOUR=20;
		//variables
		int empHrs=0;
		int empWage=20;
		double empCheck = Math.floor(Math.random()*10)%3;
			
		if(empCheck==PART_TIME)
			empHrs=4;
		else if (empCheck==Full_TIME)
			empHrs=8;
		else
			empHrs=0;
		
		empWage=empHrs*RATE_PER_HOUR;
		System.out.println("Employee Wase is : "+empWage);
	}

}
