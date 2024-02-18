package com.ATM_Interface;

class ATM_machine extends Bank_Balance{
	public int Withdraw(int Amount) {
		System.out.println("Checking your balance");
		System.out.println();
		if(Balance>Amount) {
			Balance=Balance-Amount;
			System.out.println("Rs"+Amount+" has been withdrawn from your account");
			System.out.println();
		}else {
			System.out.println("insufficient balance");
		}
		return Amount;
	}
	public int Deposite(int Amount) {
		System.out.println("Depositing "+Amount+" in your Account...");
		System.out.println();
		Balance=Balance+Amount;
		System.out.println("Succesfully deposited Rs"+Amount+" in your acount");
		System.out.println();
		return Amount;
	}
	public void checkBalance(){
		System.out.println("Checking for your balance...");
		System.out.println();
		System.out.println("Rs"+Balance+" is in your bank account");
		System.out.println();
	}
}