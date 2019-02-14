package com.chaitali.project.AssignmentFolder;

public class BankAccountController {
	
	BankAccountServiceImpl bankAccountServiceImpl=null;
	
	public BankAccountController(){
		
	}
	
	public BankAccountController(BankAccountServiceImpl bankAccountServiceImpl) {
		super();
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}
	
	public BankAccountServiceImpl getBankAccountServiceImpl() {
		return bankAccountServiceImpl;
	}

	public void setBankAccountServiceImpl(
			BankAccountServiceImpl bankAccountServiceImpl) {
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}

	public double withdraw(long accountId, double balance){
		return bankAccountServiceImpl.withdraw(accountId, balance);
	}
	public double deposit(long accountId, double balance){
		return bankAccountServiceImpl.deposit(accountId, balance);
	}
	public double getBalance(long accountId){
		return bankAccountServiceImpl.getBalance(accountId);
	}
	public boolean fundTransfer(long fromAccount, long toAccount, double amount){
		return bankAccountServiceImpl.fundTransfer(fromAccount, toAccount, amount);
	}

	@Override
	public String toString() {
		return "BankAccountController [bankAccountServiceImpl="
				+ bankAccountServiceImpl + "]";
	}
	
	
}
