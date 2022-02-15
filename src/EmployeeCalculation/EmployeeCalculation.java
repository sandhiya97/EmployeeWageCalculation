package EmployeeCalculation;
public class EmployeeCalculation {
	

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		System.out.println("Checking whether the Employee is present or absent");
		int randomValue = (int)Math.round(Math.random());
		System.out.println(randomValue);
		if(randomValue == 1)
		{
			System.out.println("Employee is Present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
		System.out.println("Calculation of Daily Employee wage");
		int wagePerHr=20;
		int	fullDayHour=8;
		int	DailyEmpWage=((wagePerHr*fullDayHour));
	    System.out.println(DailyEmpWage + " is the Daily wage of an Employee");
	    System.out.println("Calculation of Daily Employee wage for a Part time Employee");
	    int partTimeHour=4;
	    int DailyEmpWagePartTime=(wagePerHr*partTimeHour);
	    System.out.println(DailyEmpWagePartTime + " is the Daily wage of a Part time employee");
	    switch (randomValue)
	    {
	    case 0:
	    	System.out.println("Employee is absent and there is no wages for today");
	    	break;
	    case 1:
	    	System.out.println("Employee is present and the daily wage is " + DailyEmpWage );
	    	break;
	    }
	    System.out.println("Calculating wages for a month");
	    int wagesPerMonth=(DailyEmpWage*20);
	    System.out.println("Employee wages for a month is  "+  wagesPerMonth);
	    
	    
	    
	}

}
