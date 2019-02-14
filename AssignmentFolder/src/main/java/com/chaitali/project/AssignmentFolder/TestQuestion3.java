package com.chaitali.project.AssignmentFolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion3 {
public static void main(String[] args) {
	
	
	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	BankAccountController bankAccountController=(BankAccountController) context.getBean("bankAccountController");
	System.out.println(bankAccountController);
	
	System.out.println(bankAccountController.getBalance(1));
	System.out.println(bankAccountController.deposit(1, 5000));
	System.out.println(bankAccountController.withdraw(1, 10000));
	System.out.println("to account balance " + bankAccountController.getBalance(2));
	System.out.println(bankAccountController.fundTransfer(1, 2, 5000));
	System.out.println("from account balance " + bankAccountController.getBalance(1));
	System.out.println("to account balance " + bankAccountController.getBalance(2));
	
/*	((ConfigurableApplicationContext)(context)).close();*/
	
}
}
