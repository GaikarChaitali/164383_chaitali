package com.chaitali.project.AssignmentFolder;

import java.util.List;

public class BankAccountRepositoryImpl implements BankAccountRepository {

	List<BankAccount> bankAccount=null;

	

	public BankAccountRepositoryImpl(){

	}

	public BankAccountRepositoryImpl(List<BankAccount> bankAccount) {
		super();
		this.bankAccount = bankAccount;
		
	}

	
	public List<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(List<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

	

	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub

		BankAccount account=getNewAccountId(accountId);
		if(account!=null){
			return account.getAccountBalance();
		}


		return 0;
	}

	@Override
	public double updateBalance(long accountId, double newBalance) {
		// TODO Auto-generated method stub


		BankAccount account=getNewAccountId(accountId);
		if(account!=null){
			if(account.getAccountBalance()==accountId){
				return account.getAccountBalance()+  newBalance;
			}
		}
		return 0;
	}



	public BankAccount getNewAccountId(long accountId){
		if(bankAccount != null){
			for(BankAccount account: bankAccount)
			{		
				if(account.getAccountId()==accountId)
					return account;}
		}

		return null;
	}

	@Override
	public String toString() {
		return "BankAccountRepositoryImpl [bankAccount=" + bankAccount + "]";
	}

	
}
