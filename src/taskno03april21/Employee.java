package taskno03april21;
//Question No.02
import java.util.Scanner;

public class Employee implements Taxable {
	private String name;
	private int id;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void calcTax(double salary) {
		
		double income_tax = salary*incomeTax;
		System.out.println("The Income Tax: "+income_tax);	
	}
	
}
