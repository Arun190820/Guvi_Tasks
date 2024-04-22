package taskno03april21;

import java.util.Scanner;

//question  no:02
public class DriverMain {
	
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		Taxable object01 =new Employee();
		Employee object02 = new Employee();
		Taxable object03 = new Product();
		Product object04 = new Product();
		int id;
		String name;
		double salary;
		System.out.println("Enter the employee id: ");
		id = object.nextInt();
		object02.setId(id);
		System.out.println("Enter employee name: ");
		name = object.next();
		object02.setName(name);
		System.out.println("Enter the employee salary per annum: ");
		salary = object.nextDouble();
		object02.setSalary(salary);
	   object01.calcTax(object02.getSalary());
	   
	   System.out.println("\nEnter the Product Pid: ");
	   object04.setId(object.nextInt());
	   System.out.println("Enter the product Price: ");
	   object04.setPrice(object.nextDouble());
	   System.out.println("Enter the quantity of the product: ");
	   object04.setQuantity(object.nextDouble());
	   object03.calcTax((object04.getPrice()*object04.getQuantity()));
		
	
	}

}
