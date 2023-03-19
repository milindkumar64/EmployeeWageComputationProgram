package com.bridgelabz.ucfour;

public class PartTimeWageUsingSwitchCase {

	public static void main(String[] args) {
		
		        //Constants
				final int IS_PART_TIME=1;
				final int Full_TIME=2;
				final int RATE_PER_HOUR=20;
				//variables
				int empHrs=0;
				int empWage=20;
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
				System.out.println("Employee Wase is : "+empWage);
	}

}
