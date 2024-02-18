package com.ATM_Interface;

import java.util.Scanner;
public class User {

	public static void main(String[] args) {
		ATM_machine ATM=new ATM_machine();
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.println();
			System.out.println("Enter 1 to check bank balance");
			System.out.println("Enter 2 to deposite the cash");
			System.out.println("Enter 3 to withdraw the cash");
			System.out.println("Enter 4 to leave the ATM");

			int userInput=sc.nextInt();
			
			if(userInput==1) {
				System.out.println("Total balance in your bank account is "+ATM.Balance);
			}else if(userInput==2) {
				System.out.println("How much cash do you want to deposite");
				userInput=sc.nextInt();
				ATM.Deposite(userInput);
			
			}else if(userInput==3) {
				System.out.println("How much cash do you want to withdraw");
				userInput=sc.nextInt();
				ATM.Withdraw(userInput);
				
			}else if(userInput==4) {
				System.out.println("thank you for using this atm");
				break;
			}else{
				System.out.println("enter a valid number");
			}				
			}
		sc.close();		
	}

}
