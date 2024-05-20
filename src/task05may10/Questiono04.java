package task05may10;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Questiono04 {
	    
	public static void main(String args[])  
	{  
		int year, day, month;
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter the date of birth in the format of year, month, date");
	year = sc.nextInt();
	month = sc.nextInt();
	day = sc.nextInt();
	LocalDate dob = LocalDate.of(year, month, day);  
	LocalDate today = LocalDate.now();  
	Period period = Period.between(dob, today);  

	System.out.printf("Your age is %d years %d months and %d days.", period.getYears(), period.getMonths(), period.getDays());  
	}  
	}  


