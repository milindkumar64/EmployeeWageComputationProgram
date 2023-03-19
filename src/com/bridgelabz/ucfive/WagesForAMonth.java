package com.bridgelabz.ucfive;

public class WagesForAMonth {

	public static void main(String[] args) {
		
		//Constants
		final int IS_PART_TIME=1;
		final int Full_TIME=2;
		final int RATE_PER_HOUR=20;
		final int WORKING_DAYS_IN_MONTH=20;
		
		//variables
		int empHrs=0;
		int empWage=20;
		int totalWage=0;
		
		for(int i=0;i<WORKING_DAYS_IN_MONTH;i++)
		{
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
			   case IS_PART_TIME:
				   empHrs=4;
				   break;
			   case Full_TIME:
				   empHrs =8;
				   break;
			   default :
				   empHrs=0;
			}
			empWage=empHrs*RATE_PER_HOUR;
			totalWage += empWage;
			System.out.println("Employee Wase is : "+empWage);
		}
		    System.out.println("Employee Total Wase is : "+totalWage);
	}

}
