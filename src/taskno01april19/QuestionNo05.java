package taskno01april19;

import java.util.Scanner;

public class QuestionNo05 {
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		double amount = object.nextDouble();
		if(amount<500)
			System.out.println("The payable amount is "+ amount);
		else if(amount>= 500 && amount<=1000)
		{
			amount = amount -(amount*0.1);
			System.out.println(amount);
		}
		else
		{
			amount = amount -(amount*0.2);
			System.out.println(amount);
		}

	}

}
