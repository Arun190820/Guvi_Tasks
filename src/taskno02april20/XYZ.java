package taskno02april20;
import java.util.*;
import java.util.Scanner;
//question no.02
public class XYZ{
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		Product [] array = new Product[5];
		int i=0;
		double a=0;
		double pid, price, quantity;
		for(; i<5; i++)
		{
		    array[i]=new Product();
			System.out.println("enter the product pid: ");
		    pid = object.nextDouble();
			System.out.println("enter the product price: ");
		    price = object.nextDouble();
			System.out.println("enter the product quantity: ");
		    quantity = object.nextDouble();
		    array[i].Product(pid, price, quantity);
		  a+= total(pid, price, quantity); 
		}
		
		double max= array[0].price();
		int b=0;
		for(i=0; i<5; i++) {
			if(array[i].price()>=max)
			{
				max= array[i].price();
				b=i;
			}	
		}
		System.out.println(array[b].pid +" is the pid of highest price");
		System.out.println("Total amount spent on all products "+ a);
	}
	public static double total(double pid, double price, double quantity)
	{
		double a=0;
		a=(price*quantity);
		return(a);
	}

	

	
	

}
