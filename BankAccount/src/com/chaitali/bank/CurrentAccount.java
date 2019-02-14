package com.chaitali.bank;

public class CurrentAccount extends BankAccount {

	private double odLimit = 10000;

	public CurrentAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
	}

	@Override
	public void withdraw(double amount) {
		//check account balance
			//withraw
		//check odlimit
			//withraw()
		//no
		
		
		
		System.out.println("odLimit : "+odLimit);
		if(accountBalance-amount>=0)
		{
			accountBalance-=amount;
			System.out.println(" Remaining Balance in account="+accountBalance);
		}
		else if(accountBalance+odLimit-amount>=0){
			System.out.println("Account balance : 0");
			System.out.println("odLimit balance:"+ (accountBalance+odLimit-amount));
		}
		else{
		System.out.println("minimize your withdraw amount");}
		
	}
}
