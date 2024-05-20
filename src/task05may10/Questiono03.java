package task05may10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Questiono03 {
	public static void main(String[] args)
	{
		int i;
		String name;
	    Scanner scanner = new Scanner(System.in);	
		List<String> object = new ArrayList<String>();
		System.out.println("Enter the students name continously ");
		for(i=0; i<10; i++)
		{
			object.add(name= scanner.next());
		}
		List<String> object01 = object.stream().filter(n-> n.startsWith("A")).collect(Collectors.toList());
		System.out.println("The Gifts to be recevied by the students are "+object01);
	}
}
