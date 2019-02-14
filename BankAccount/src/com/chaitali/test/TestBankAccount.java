package com.chaitali.test;
 
import com.chaitali.bank.BankAccount;
import com.chaitali.bank.CurrentAccount;
import com.chaitali.bank.SavingAccount;
import com.chaitali.bank.SavingAccountVer2;

public class TestBankAccount {

	public static void testBankAccountMethod(){
		//BankAccount acc=new BankAccount();
		//acc.setAccountHolderName("chaitali");
		
	}
	
	
	
	public static void testSavingAccount(){
		/*SavingAccount savingAcc=new SavingAccount("chaitali",5000);
		System.out.println("account no is"+savingAcc.getAccountNo());
		System.out.println("account balance"+savingAcc.getAccountBalance());
		savingAcc.deposite(5000);
		System.out.println("account balance"+savingAcc.getAccountBalance());
		savingAcc.withdraw(2000);
		System.out.println("account balance"+savingAcc.getAccountBalance());
     	System.out.println("/////////////////////////////////////////");*/
	}
	
	
	
	
	public static void testCurrentAccount(){
		/*CurrentAccount currentAcc=new CurrentAccount("chaitali",40000);
		System.out.println("account no is"+currentAcc.getAccountNo());
		System.out.println("account balance"+currentAcc.getAccountBalance());
		//currentAcc.deposite(5000);
		//System.out.println("account balance"+currentAcc.getAccountBalance());
		currentAcc.withdraw(50000);
		//System.out.println("account balance"+currentAcc.getAccountBalance());*/
		
	}
	
	public static void getBankAccount(String accountType){
	/*	BankAccount acc=null;
		if(accountType.equals("Saving")){
			acc = new SavingAccount("Chaitli",4000);
		}
		else if(accountType.equals("Current")){
			acc = new CurrentAccount("Onkar",8000);
		}
		else{
			acc=null;
		}
		return acc;
	}*/
	}
	public static void main(String[] args){
		
		SavingAccountVer2 acc=new SavingAccountVer2();
		acc.withdraw(400);
		acc.deposite(4000);
		acc.isSalaryAcccount();
		acc.getInsuranceAmount();
		acc.withdraw(400);
		System.out.println(acc.getInsuranceAmount());
	}
		//testBankAccountMethod();
	/*BankAccount acc=getBankAccount("Saving");
	System.out.println("account name"+acc.getAccountHolderName());
	System.out.println("account balance"+acc.getAccountBalance());
	acc.withdraw(3000);
	System.out.println("account balance"+acc.getAccountBalance());
	acc.deposite(5000);
	System.out.println("account balance"+acc.getAccountBalance());
	//testSavingAccount();
	//testCurrentAccount();*/

		
	
}
	

