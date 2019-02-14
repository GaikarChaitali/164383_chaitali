package com.chaitali.project.AssignmentFolder;

public class BankAccountServiceImpl implements BankAccountService{
	BankAccountRepositoryImpl bankAccountServiceImpl=null;



	public BankAccountServiceImpl(){

	}

	public BankAccountServiceImpl(BankAccountRepositoryImpl bankAccountServiceImpl) {
		super();
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}

	public BankAccountRepositoryImpl getBankAccountServiceImpl() {
		return bankAccountServiceImpl;
	}

	public void setBankAccountServiceImpl(
			BankAccountRepositoryImpl bankAccountServiceImpl) {
		this.bankAccountServiceImpl = bankAccountServiceImpl;
	}

	@Override
	public double withdraw(long accountId, double balance) {
		// TODO Auto-generated method stub

		double newBalance=bankAccountServiceImpl.getBalance(accountId)-balance;
		return bankAccountServiceImpl.updateBalance(accountId, newBalance);




	}

	@Override
	public double deposit(long accountId, double balance) {
		// TODO Auto-generated method stub

		double newBalance=bankAccountServiceImpl.getBalance(accountId)+ balance;
		return bankAccountServiceImpl.updateBalance(accountId, newBalance);
	}


	@Override
	public double getBalance(long accountId) {
		// TODO Auto-generated method stub
		return bankAccountServiceImpl.getBalance(accountId);
	}

	@Override
	public boolean fundTransfer(long fromAccount, long toAccount, double amount) {
		// TODO Auto-generated method stub
		double account1=withdraw(fromAccount,amount);
		if(account1!=0){
			double account2=deposit(toAccount, amount);
			if(account2!=0)
				return  true;
		}deposit(toAccount, amount);

		return false;
	}

	@Override
	public String toString() {
		return "BankAccountServiceImpl [bankAccountServiceImpl="
				+ bankAccountServiceImpl + "]";
	}

}
