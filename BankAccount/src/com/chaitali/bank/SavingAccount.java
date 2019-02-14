package com.chaitali.bank;

public class SavingAccount extends BankAccount {
   
	 private boolean isSalaryAccount ;
	 
	 public SavingAccount(String accountHolderName, double accountBalance)
	 {
		 super(accountHolderName,accountBalance);
		 this.isSalaryAccount=true;
	 }
	 
	 
      public SavingAccount(){
    	  this.isSalaryAccount=true;
      }
      
      
      public SavingAccount(String accountHolderName, double accountBalance, boolean isSalaryAccount)
 	 {
 		 super(accountHolderName,accountBalance);
 		 this.isSalaryAccount=isSalaryAccount;
 	 }
      
      public boolean isSalaryAcccount(){
    	  return isSalaryAccount;
      }
      
      
      @Override
    public void withdraw(double amount) {
    	// TODO Auto-generated method stub
    	super.withdraw(amount);
    }
      
}
