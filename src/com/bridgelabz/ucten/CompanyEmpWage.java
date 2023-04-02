package com.bridgelabz.ucten;

public class CompanyEmpWage {

	final String companyName;
	final int ratePerHour;
	final int workingDaysInMonth;
	final int maxHoursInMonth;
	int totalWage;

public CompanyEmpWage( String companyName,int ratePerHour,int workingDaysInMonth,int maxHoursInMonth)
{
this.companyName = companyName;
this.ratePerHour = ratePerHour;
this.workingDaysInMonth = workingDaysInMonth;
this.maxHoursInMonth = maxHoursInMonth;
}
public void setTotalEmpWage(int totalEmpWage){
	this.totalWage = totalEmpWage;	
}
@Override
public String toString()
{
	return "Total Emp Wage for : " +companyName+ " is :"+totalWage;
	
}

}
