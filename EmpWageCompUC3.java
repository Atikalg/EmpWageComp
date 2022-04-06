package com.bridgelab.Assignment4;
/**
 * @author atik
 *	Add part time employee and wage
 */
public class EmpWageCompUC3 {
	public static void main (String[] args) {
		System.out.println("Welcome to Employee wage computation program");
		// Constants
		int isPartTime = 1;
		int isFullTime = 2;
		int empRatePerHour =20;
		//variable
		int empHrs = 0;
		int empWage = 0;
		//calculation
		double empCheck = Math.floor(Math.random() * 10) % 3;
		// Check Present Employee is Part time or Full time
		if (empCheck == isPartTime)
			empHrs = 4;
		else if (empCheck == isFullTime)
			empHrs = 8;
		else 
			empHrs = 0;
		empWage = empHrs * empRatePerHour;
		System.out.println("Employee Wage : " + empWage);
	}

}
