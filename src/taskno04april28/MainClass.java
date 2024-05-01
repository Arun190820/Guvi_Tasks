package taskno04april28;

import java.util.Scanner;

//question no.01
public class MainClass {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int age, rollno;
	String name, course;
	
	System.out.println("Entre the rollno of a Student ");
	rollno = scanner.nextInt();
	
	System.out.println("Enter the name of a Student ");
	name = scanner.next();
	int b=0;
	try {
		 b= name_02(name.toCharArray());
	} catch (NameNotValidException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
	if(b!=1)
		name = scanner.next();

	System.out.println("Enter the age of a Student");
	age = scanner.nextInt();
	int a = 0;
	try {
		 a = age_01(age);
	} catch (AgeNotWithinRangeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   if(a!=1)
		{age = scanner.nextInt();}
	   
	System.out.println("Enter the course of a student");
	course = scanner.next();
	
	Student object = new Student(rollno, name, age, course);
	System.out.println("Name: "+object.getName()+"\nRoll_No: "+object.getRollno()+"\nAge: "+object.getAge()+"\nCourse: "+ object.getCourse());
	}
	public static int  age_01(int age) throws AgeNotWithinRangeException{
		if(age <15 || age >21) {
			throw new AgeNotWithinRangeException("Enter the age between 15 and 21");}
		else {
		return 1;	}
	}
	public static int name_02(char [] name)throws NameNotValidException {
		int a = name.length, i=0;
		for(i=0; i<a; i++ )
		{
		  if(name[i]==1 ||name[i]==2 || name[i]==3 ||name[i]==4 ||name[i]==5
				  ||name[i]==6 ||name[i]==7 ||name[i]==8 ||name[i]==9 ||name[i]==0 ||name[i]=='#'
				  ||name[i]=='!'||name[i]=='$' ||name[i]=='%' ||name[i]=='@' ||name[i]=='^'
				  ||name[i]=='&' ||name[i]=='*' ||name[i]=='(' ||name[i]==')')
		  {throw new  NameNotValidException("Enter a name which should not contain numbers as well as Special Symbols");}
		}
		return 1;
		
	}
}
