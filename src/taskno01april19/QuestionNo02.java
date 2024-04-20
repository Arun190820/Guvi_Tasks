package taskno01april19;

import java.util.Scanner;

public class QuestionNo02 {
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		int a = object.nextInt();
		if(a>0)
			System.out.println("entered number is positive");
		else if (a==0)
			System.out.println("entered number is Zero provide an input which should be either positive or negative");
		else
			System.out.println("entered number is negative");
	}

}
