package com.chaitali.project.AssignmentFolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion8 {
public static void main(String[] args) {
	
	AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	Employee employee=(Employee) context.getBean("employee");
	context.registerShutdownHook();
	System.out.println(employee);
}
}
