package taskno02april20;

import java.util.Scanner;
//question no.03
public class Account {
  public static int  balance =10000;
  


public  Account(int withdraw, int deposit) {
	if(deposit ==0 )
	balance = balance - withdraw;
	
	else if(withdraw ==0)
	balance = balance + deposit;
	
	toDisplayBalance();
}
 public static  void toDisplayBalance()
 {
	System.out.println("The Balance amount: "+ balance ); 
 }

public   Account() {
    
}


public static void main(String[] args) {
	Scanner object = new Scanner (System.in);
	System.out.println("consisdered initial bank balance is rs: 10000");
	System.out.println("Press 1 to withdraw the amount or Press 2 to deposit the amount");
	
	int a = object.nextInt();
	 int withdraw, deposit;
	
	if(a==1) {
	System.out.println("Enter the amount to withdraw ");
	withdraw = object.nextInt();
	deposit =0;
	Account object01 = new Account(withdraw, deposit);
	}
	else if(a==2)
	{
		System.out.println("Enter the amount to deposit ");
		deposit = object.nextInt();
		withdraw =0;
		Account object01 = new Account(withdraw, deposit);
	}
	Account object01 =  new Account();
}


}
