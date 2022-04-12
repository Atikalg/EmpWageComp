package com.bridgelab.Assignment4;

public class EmpwageCompUC8 {

	 public static final int IS_FULL_TIME=2;
	   public static final int IS_PART_TIME=1;

	   public final String company;
	   public final int empRatePerHour;
	   public final int numOfWorkingDays;
	    public final int maxHoursPerMonth;
	    public int totalEmpWage;

	    public EmpwageCompUC8(String company,int empRatePerHour,int numOfWorkingDays,int maxHoursPerMonth){
	        this.company = company;
	        this.empRatePerHour = empRatePerHour;
	        this.numOfWorkingDays = numOfWorkingDays;
	        this.maxHoursPerMonth = maxHoursPerMonth;
	    }
	    public void computeEmpWage(){
	        int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
	        while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
	        {
	            totalWorkingDays++;
	            int empCheck = (int) Math.floor(Math.random()*10)%3;
	            switch (empCheck){
	                case 2:
	                    empHrs=8;
	                    break;
	                case 1:
	                    empHrs=4;
	                    break;
	                default:
	                    empHrs=0;
	                    break;
	            }
	            totalEmpHrs+=empHrs;
	            System.out.println("Days:"+totalWorkingDays+"Emp Hour:"+empHrs);
	        }
	        totalEmpWage = totalEmpHrs * empRatePerHour;
	    }

	    public String toString(){
	        return "Total employee wage for company:"+company+"is:"+totalEmpWage;
	    }

	    public static void main(String[] args)
	    {
	    	EmpwageCompUC8 dMart = new EmpwageCompUC8("DMart",20,2,10);
	    	EmpwageCompUC8 reliance = new EmpwageCompUC8("Reliance",10,4,20);
	        dMart.computeEmpWage();
	        System.out.println(dMart);
	        reliance.computeEmpWage();
	        System.out.println(reliance);
	    }
}
