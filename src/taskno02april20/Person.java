package taskno02april20;

import java.util.Scanner;
//question no. 01
public class Person {
	public int age =18;
      public String name;
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		Person person = new Person();
		
		person.name = object.nextLine();
		details(person.age, person.name);
	}
	public static void details(int age, String name)
	{
	
		System.out.println("Name: "+name+" age: "+age);
	}
}
