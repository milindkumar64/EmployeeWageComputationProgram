package com.bridgelabz.uceleven;

public class EmployeeWageBuilder implements IComputeEmpWage {
	
	static  final int IsPartTime = 1;
	static  final int FullTime = 2;
	 
	 private int numOfCompany = 0;
	 private CompanyEmpWage[] companyEmpWageArray;
	 
	 public EmployeeWageBuilder()
	 {
		 companyEmpWageArray = new  CompanyEmpWage[5];
	 }
	 public void addCompanyEmpWage(String company, int ratePerHour, int workingDaysInMonth, int maxHoursInMonth)
	 {
		companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company,ratePerHour,workingDaysInMonth,maxHoursInMonth);
		numOfCompany++;
	 }
	 public void computeEmpWage() {
		 for(int i =0;i<numOfCompany;i++)
		 {
			 companyEmpWageArray[i].setTotalEmpWage(computeEmpWage(companyEmpWageArray[i]));
			 System.out.println(companyEmpWageArray[i]);
		 }
	 }
	 public int  computeEmpWage(CompanyEmpWage CompanyEmpWage ) {
			int empHrs = 0;
			int empWage = 20;

			int totalHrs = 0;
			int totalDays = 1;

			while (totalDays < CompanyEmpWage.workingDaysInMonth && totalHrs < CompanyEmpWage.maxHoursInMonth) 
			{
				int empCheck = (int) Math.floor(Math.random() * 10) % 3;
				totalDays++;
				switch (empCheck) {
				case IsPartTime:
					empHrs = 4;
					break;
				case FullTime:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
				}
				totalHrs += empHrs;
				empWage = empHrs * CompanyEmpWage.ratePerHour;
				CompanyEmpWage.totalWage += empWage;
			}
			return CompanyEmpWage.totalWage;
	}	 
	public static void main(String[] args) {
	
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		empWageBuilder.addCompanyEmpWage("trends",20,20,100);
		empWageBuilder.addCompanyEmpWage("zudio",24,22,110);
		empWageBuilder.computeEmpWage();
    
	}

}