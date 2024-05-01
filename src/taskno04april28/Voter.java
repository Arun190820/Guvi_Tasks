package taskno04april28;

import java.util.Scanner;

//question no.02
public class Voter {
int voterID;
String name;
int age;
public Voter(int voterID, String name, int age)throws InvalidAgeException {
	voterID = voterID;
	this.name = name;
	this.age = age;
	if(age <18)
	{
		throw new InvalidAgeException("invalid age for voter");
	}
}

public static void main(String[] args) {
	int age, voter;
	String name;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the VoterId: ");
	voter = scanner.nextInt();
	
	System.out.println("Enter the Name: ");
	name = scanner.next();
	
	System.out.println("Enter the Age: ");
	age = scanner.nextInt();
	try {
		Voter object = new Voter(voter, name, age);
	} catch (InvalidAgeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}






}
