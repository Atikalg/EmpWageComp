package com.bridgelab.Assignment4;

public class EmpWageComUC7 {
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;
	public static final int empRatePerHour = 20;
	public static final int numOfWorkingDays = 20;
	public static final int maxHrsInMonth = 100;
	
	public static int computeEmployeeWage() {
		//variables
				int empHrs = 0;
				int totalEmpHrs = 0;
				int totalWorkingDays = 0;
				//computation
				while ((totalEmpHrs <= maxHrsInMonth) && (totalWorkingDays < numOfWorkingDays)) {
					totalWorkingDays++;
					int empCheck = (int) Math.floor(Math.random() * 10) % 3;
					// Use switch case to check employee is full time, part time or absent
					switch(empCheck) {
					case isPartTime : System.out.println("Employee Present : Full time");
						empHrs = 8;
						break;
					case isFullTime : System.out.println("Employee Present : Part time");
						empHrs = 4;
						break;
					default : System.out.println("Employee is Absent");
						empHrs = 0;
				}
					//calculation for employee wage
					totalEmpHrs += empHrs;
					System.out.println("Day : " + totalWorkingDays + " Employee hours : " + empHrs);
				}
				// calculating monthly wages
				int totalEmpWage = totalEmpHrs * empRatePerHour;
				System.out.println("Employee worked " + totalEmpHrs + " Hrs in " + totalWorkingDays + " days.");
				System.out.println("Total Employee Wage : " + totalEmpWage);
				return totalEmpWage;	
			}
	
public static void main(String[] args)
{
    computeEmployeeWage();
}
}
