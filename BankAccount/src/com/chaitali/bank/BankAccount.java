package com.chaitali.bank;

public abstract class BankAccount {
	//static variable
	private static int autoAccountNo;
	
	
	//instance variable/ class variable
    private int accountNo;
	private String accountHolderName;
	protected double accountBalance;
	
	//init block
	{
		accountNo=++autoAccountNo;
	}
    
	//default constructor
	public BankAccount(){
		
		accountHolderName="unknown";
		accountBalance=40000;
		
	}
	
	//parameterize constructor
	public BankAccount(String accountHolderName , double accountBalance){
	
	//setter method modify/reinitialize member variable
	
	this.accountHolderName=accountHolderName;
	this.accountBalance=accountBalance;
    
	}
	
	public void	setAccountHolderName(String accountHolderName){
		this.accountHolderName=accountHolderName;
	}
	
	//getter
	public double getAccountBalance() {
		return accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public int getAccountNo() {
		return accountNo;
	}
	
	
	
	//service method
	public void withdraw(double amount){
		if((this.accountBalance-amount)>1000 && amount>0 && amount<this.accountBalance)
		{
			System.out.println("wlcome user you can withdraw amount");
			this.accountBalance-=amount;
			System.out.println("accountBalance="+this.accountBalance+"amount to withdraw="+amount);
		}
		
	}
	
	public void deposite(double amount){
		if(amount>0)
		{
		this.accountBalance+=amount;
		System.out.println("Amount after deposite is="+this.accountBalance);
		}
		}
	
	public static void main(String[] args) {
		//BankAccount acc=new BankAccount();
		//BankAccount acc2=new BankAccount("chaitali",5000);
		//acc2.withdraw(2000);
		//acc2.deposite(23000);
	}

	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
