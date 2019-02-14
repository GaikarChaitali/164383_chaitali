package com.chaitali.project.AssignmentFolder;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Customer customer=(Customer) context.getBean("customer");
		System.out.println(customer);
		System.out.println("      ");
		customer.printDetails();
	}

}
