package taskno04april28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//question no.03
public class Day {

	public static void main(String[] args) {
		
		List<String> object01 = new ArrayList<>();
		object01.add("Sunday");
		object01.add("Monday");
		object01.add("Tuesday");
		object01.add("Wednesday");
		object01.add("Thursday");
		object01.add("Friday");
		object01.add("Saturday");
		object01.forEach(item -> System.out.println(item));
		int a =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the index position: ");
		a = scanner.nextInt();
		int b =0;
	   try
	   {
		   if(a>6)
		   b = array(object01, a );
		   System.out.println(object01.get(a));
	   }
	   catch(ArrayIndexOutOfBoundException e) {
		   e.printStackTrace();
	   }
	   
	   if(b==0)
	   {
		   a = scanner.nextInt();
		   System.out.println(object01.get(a));
	   }
	}
	
	  public static int   array(List<String> a, int b) throws ArrayIndexOutOfBoundException
	  {
		  if(b >6)
			  throw new ArrayIndexOutOfBoundException("Enter the index number between 0 to 6");
		  else
			  return 1;
	  }
	}
	

