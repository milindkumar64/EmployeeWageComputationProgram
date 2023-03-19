package com.bridgelabz.ucsix;

public class CalculateWagesTillACondition {

	public static void main(String[] args) {
		
	        	//Constants
				final int IS_PART_TIME=1;
				final int Full_TIME=2;
				final int RATE_PER_HOUR=20;
				final int WORKING_DAYS_IN_MONTH=20;
				final int MAX_HOURS_IN_MONTH=100;
				
				//variables
				int empHrs=0;
				int empWage=20;
				int totalWage=0;
				int totalHrs=0;
				int totalDays=1;
				
				while(totalDays<WORKING_DAYS_IN_MONTH && totalHrs<MAX_HOURS_IN_MONTH)
				{
					int empCheck = (int)Math.floor(Math.random()*10)%3;
					totalDays++;
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
					
					totalHrs += empHrs;
					empWage=empHrs*RATE_PER_HOUR;
					totalWage += empWage;
					System.out.println("Employee Wase is : "+empWage);
					System.out.println("Days: "+totalDays+ "empHrs :"+empHrs);
				}
				    System.out.println("Employee Total Wase is : "+totalWage);		
				   System.out.println("days"+totalDays);
				   System.out.println("totalHrs : "+totalHrs);


	}

}
