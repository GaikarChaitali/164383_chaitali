package com.chaitali.project.AssignmentFolder;

public interface BankAccountRepository {
	public double getBalance(long accountId);
	public double updateBalance(long accountId, double newBalance);
}
