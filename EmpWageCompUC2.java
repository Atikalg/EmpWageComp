package com.bridgelab.Assignment4;

public class EmpWageCompUC2 {

	public static void main(String[] args) {
		int isFullTime = 1;
		int EmpRatePerHour =20;
		// Variable
		int empHrs = 0;
		int empWage = 0;
		// Calculation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if ( empCheck == isFullTime )
			empHrs = 8;
		else
			empHrs = 0;
		empWage = empHrs * EmpRatePerHour;
		System.out.println("Employee wage : " + empWage);
	}

}
