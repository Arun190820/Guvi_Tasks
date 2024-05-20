package task05may10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Questiono02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean a;
		int i;
		String b;
		List<String> object01 = new ArrayList<String>();
		List<String> object02 = new ArrayList<String>();
//		System.out.println("Enter the no. of strings to be stored in list");
//		a = scanner.nextInt();
//		for( i=0; i<a; i++)
//		{
//			System.out.println("enter "+(i+1)+" element of list ");
//			object01.add(b = scanner.next());
//		}
//        System.out.println(object01);
		//above for loop has been used but i don't how to give empty string as an input through scanner pls leave a command
		object01.add("abc");
		object01.add("");
		object01.add("bc");
		object01.add("efg");
		object01.add("abcd");
		object01.add("");
		object01.add("jkl");
	
		for(i=0; i<object01.size(); i++)
		{
			a = object01.get(i).isEmpty();
			if(a==false)
				object02.add(object01.get(i));
		}
		System.out.println("The non-empty strings in that list are "+ object02);
	}

}
