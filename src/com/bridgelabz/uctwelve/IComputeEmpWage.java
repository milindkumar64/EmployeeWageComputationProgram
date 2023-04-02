package com.bridgelabz.uctwelve;

public interface IComputeEmpWage {
	
	public void addCompanyEmpWage(String company, int ratePerHour, int workingDaysInMonth, int maxHoursInMonth);
	
	public void computeEmpWage();
	
	public int  computeEmpWage(CompanyEmpWage CompanyEmpWage);
	
}
