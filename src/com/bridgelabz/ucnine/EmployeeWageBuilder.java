package com.bridgelabz.ucnine;

public class EmployeeWageBuilder {

	final int IsPartTime = 1;
	final int FullTime = 2;

	final String companyName;
	final int ratePerHour;
	final int workingDaysInMonth;
	final int maxHoursInMonth;
	int totalWage;

	public EmployeeWageBuilder(String companyName, int ratePerHour, int workingDaysInMonth, int maxHoursInMonth) {
		this.companyName = companyName;
		this.ratePerHour = ratePerHour;
		this.workingDaysInMonth = workingDaysInMonth;
		this.maxHoursInMonth = maxHoursInMonth;
	}

	public void employeeWageCalculator() {
		int empHrs = 0;
		int empWage = 20;

		int totalHrs = 0;
		int totalDays = 1;

		while (totalDays < workingDaysInMonth && totalHrs < maxHoursInMonth) {
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

			empWage = empHrs * ratePerHour;
			totalWage += empWage;

		}

	}

	@Override
	public String toString() {
		return "Total Emp Wage for : " + this.companyName + " is :" + totalWage;

	}

	public static void main(String[] args) {

		EmployeeWageBuilder trends = new EmployeeWageBuilder("Trends", 20, 20, 100);
		EmployeeWageBuilder zudio = new EmployeeWageBuilder("Zudio", 24, 22, 110);
		trends.employeeWageCalculator();
		System.out.println(trends.toString());
		zudio.employeeWageCalculator();
		System.out.println(zudio.toString());

	}

}
