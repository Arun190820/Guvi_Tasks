package taskno03april21;

import java.util.Scanner;
//Question No.01
public class Main {
	
	public static void main(String[] args) {
		Library object = new Library();
		Scanner object01 = new Scanner(System.in);
		
		System.out.println("Enter the value which indicates the no. of books to be store");
		int a = object01.nextInt();
		object.library(a);
		int b=0, c=0;
		System.out.println("Enter 1 to  add the books");
		b= object01.nextInt();
		if(b==1)
		{
		object.toAddBooks(a);
		}
		System.out.println("Enter the 02, 03, 04 to remove, to search, to display all the books");
		b = object01.nextInt();
		if(b==2)
		{
			System.out.println("Enter the book ID to remove the book: ");
			c = object01.nextInt();
			object.toSearch(a, c);
		}
		
		else if(b==3)
		{
			System.out.println("Enter the book ID to search the book: ");
			c = object01.nextInt();
			object.toSearch(a, c);
		}
		else if(b==4)
		{
		object.toDisplayAll( a);
		}
	}
	

}
