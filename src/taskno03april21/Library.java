package taskno03april21;

import java.util.Scanner;

//Question No.01
public class Library {
	
	 protected  Book[] books ;
	public void library(int a)
	{
	
		//Book object01 = new Book();
		//books = new Book[a];
	this.books= new Book[a];
	//System.out.println(books.length);
		
	}
	public void toAddBooks(int a)
	{
	   //this.books = new Book[a];	
		Scanner object = new Scanner(System.in);
		int id;
		String title, author, avialable;

		for(int i=0; i<a; i++  ) {
		books[i]= new Book();
	    System.out.print("Enter the book id: ");
	    id =object.nextInt();
	    books[i].setBookID(id);
	    
		System.out.print("Enter the book title: ");
		title = object.next();
		books[i].setTitle(title);
		
		System.out.print("Enter the book author: ");
		author = object.next();
		books[i].setAuthor(author);
		    
		books[i].setIsAvailable("yes");
		}
	}
	
	public void toSearch(int a, int c)
	{
		int d =0;
		for(int i=0; i<a; i++)
		{
			if(c == books[i].getBookID())
			{
				books[i].search();
				d=1;
			}
		}
		if(d==0)
			System.out.println("The respective Book is not avialable");
	}
	
	public void toRemove(int a, int c)
	{
		int d=0;
		for(int i=0; i<a; i++)
		{
			if(c== books[i].getBookID())
			{
				books[i].setBookID(0);
				books[i].setTitle(null);
				books[i].setAuthor(null);
				books[i].setIsAvailable(null);
				d=1;
			}
		}
		if(d==0)
			System.out.println("Enter a valid BookID to remove");
	}
	
	
	
	public void toDisplayAll(int a)
	{
		//books = new Book[a];
		int i=0;
		for(; i<a; i++)
		{
			//books[i]= new Book();
			System.out.print("\n      Book No."+(i+1));
			System.out.print("\nBookID: "+books[i].getBookID());
			System.out.print("\nBook-Title: "+books[i].getTitle());
			System.out.print("\nBook-Author: "+books[i].getAuthor());
			System.out.print("\nIs the book available: "+books[i].getIsAvailable());
			}
	}
	

}
