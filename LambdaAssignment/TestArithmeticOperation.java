package LambdaAssignment;

import java.util.Scanner;

import LambdaAssignment.ArithmeticOperation.Calculate;

public class TestArithmeticOperation {
	public static void main(String[] args) {


		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter numbers to perform operation");
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();

		Calculate addition=(int a, int b)->a+b;
		System.out.println("Addition of two no is:");
		System.out.println(addition.calculate(num1, num2));

		Calculate subtraction=(int a, int b)->a-b;
		System.out.println("Subtraction of two no is:");
		System.out.println(subtraction.calculate(num1, num2));


		Calculate multiplication=(int a, int b)->a*b;
		System.out.println("Multiplication of two no is:");
		System.out.println(multiplication.calculate(num1, num2));

		Calculate division=(int a, int b)->{
			int c=0;

			try{
				a=num1/num2;
			}catch(ArithmeticException e)
			{
				System.out.println("Please enter valid num2");
				//System.out.println(division.calculate(num1,num2));
			}

			return c;};
			System.out.println("Division of two no is:");
			System.out.println(division.calculate(num1, num2));



	}
	
}