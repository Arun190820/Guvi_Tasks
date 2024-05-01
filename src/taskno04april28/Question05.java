package taskno04april28;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Question05 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int c =0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 01 to push elements into the Stack");
		c = scanner.nextInt();
		
		if(c==1)
		{
			stack = toPush(stack);
			System.out.println("Enter 02 or 03 to pop the elements or to check wheather the stack is empty or not");
		}
		
		c = scanner.nextInt();
		if(c==2)
		{
			stack = toPop(stack);
			System.out.println("Enter 03  to check wheather the stack is empty or not");
		}
		
		c = scanner.nextInt();
		if(c==3)
		{
			toCheck(stack);
		}
	}

	public static Stack<Integer> toPush(Stack<Integer> stack)
	{
		int a, i, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number which indicates number of elements to be stored in stack");
		a = scanner.nextInt();
		
		for(i=0; i<a; i++)
		{
			System.out.println("enter the "+(i+1)+ " element");
			c = scanner.nextInt();
			stack.push(c);
		}
		
		return stack;
	}
	public static Stack<Integer> toPop(Stack<Integer> stack)
	{
		int a, i, c;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number which indicates number of elements to be remove");
		a = scanner.nextInt();
		
		for(i=0; i<a; i++)
		{
			stack.pop();
		}
	
		return stack;
	}
	public static void toCheck(Stack<Integer> stack)
	{
	  boolean b = stack.isEmpty();
	  if(b==false)
		  System.out.println("The Stack isn't empty it contains elements "+ stack);
	  else if(b ==true)
		  System.out.println("The Stack is empty");
	}
}
