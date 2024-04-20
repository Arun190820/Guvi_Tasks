package taskno01april19;

import java.util.Scanner;

public class QuestionNo04 {
	public static void main(String[] args) {
		Scanner object = new Scanner(System.in);
		int a = object.nextInt();
		int b = object.nextInt();
		int c = object.nextInt();
		if(a>b && a>c)
			System.out.println(a+" is the largest number");
		else if(b>a && b>c)
			System.out.println(b+" is the largest number");
		else
			System.out.println(c+" is the largest number");
	}

}
