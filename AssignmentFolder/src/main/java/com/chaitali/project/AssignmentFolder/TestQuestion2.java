package com.chaitali.project.AssignmentFolder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestQuestion2 {
	public static void main(String[] args) {


		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Question question=(Question) context.getBean("question");
		System.out.println(question);
	}

}
