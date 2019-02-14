package com.chaitali.project.AopAssigment;

import org.junit.Before;
@Aspect
public class AspectTest {

	
	@Before("public String getLength())")
	 public void toDisplay(){
		 System.out.println("hello shape");
	 }
}
