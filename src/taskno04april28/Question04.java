package taskno04april28;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		Map<String, Integer> object01 = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		int c=0, a =0;
		
		System.out.println("Entre no. of students to store in Hashmap");
		a = scanner.nextInt();
		for(int i=0; i<a; i++)
		{
			System.out.println("Enter the name and grade of "+(1+i)+" Student");
			object01.put(scanner.next(),scanner.nextInt());
		}
		
		System.out.println("Enter 01 to add a Student");
		c = scanner.nextInt();
		
		if(c==1)
		{
			object01 = toAddStudent(object01);
			System.out.println("Enter 02 or 03 - to remove a student, to display a student's grade by his/her name");
		}
		
		c = scanner.nextInt();
		if(c==2)
		{
			object01 = toRemove(object01);
			System.out.println("Enter 03 to display a student's grade by his/her name");
		}
		
		c =scanner.nextInt();
		if(c==3)
		toDisplay(object01);	
		 		
	}
	public static Map toAddStudent(Map<String, Integer> object01)
	{
		Scanner scanner = new Scanner(System.in);
		
			System.out.println("Enter the Student name as well as his/her grade");
			object01.put(scanner.next(),scanner.nextInt());
		
		return object01;
	}
	public static Map toRemove(Map<String, Integer> object01)
	{
		//String name;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student name to remove from the list");
		object01.remove(scanner.next());
		return object01;
		
	}

	public static void toDisplay(Map<String, Integer> object01)
	{
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("Enter the Student name to display his/her grade");
		name = scanner.next();
		System.out.println("Grade earned by "+name+" is "+ object01.get(name));
	}
}
