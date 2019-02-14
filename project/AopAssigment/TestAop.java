package com.chaitali.project.AopAssigment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestAop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Shape shape=(Shape) context.getBean("shape");
		System.out.println(shape);

	}

}
