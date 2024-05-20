package task05may10;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Questiono01 {
	public static void main(String[] args) {
		Map<Integer, String> object01 = new HashMap<Integer, String>();
		Scanner scanner = new Scanner(System.in);
		String name;
		System.out.println("enter no. of strings to be stored in the map");
		int a = scanner.nextInt();
		System.out.println("enter the strings continously");
		for(int i=0; i<a; i++)
		{
		  object01.put((1+i), name = scanner.next());	
		}
		object01 = toUppercase(object01, a);
		System.out.println(object01.entrySet());
	}
  public static Map<Integer, String> toUppercase(Map<Integer, String>a, int b)
  {
	  Map<Integer, String> object = new HashMap<Integer, String>();
	  for(int i=1; i<=b; i++)
	  {
		 object.put(i, a.get(i).toUpperCase());
	  }
	  return(object);
  }
}
