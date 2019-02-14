package com.chaitali.bank;

public class SavingAccountVer2 extends SavingAccount implements Insurance{

	@Override
	public  String getInsuranceName() {
		// TODO Auto-generated method stub
		return "jivan bima";
		
	}

	@Override
	public double getInsuranceAmount() {
		// TODO Auto-generated method stub
		return 500000;
	}

   
	
}
