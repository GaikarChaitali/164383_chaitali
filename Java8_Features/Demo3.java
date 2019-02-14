package Java8_Features;

import java.util.*;
import java.util.function.Predicate;

public class Demo3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.println("print all numbers");
		print(list,n-> true);
		System.out.println("print even numbers");
		print(list,n -> n%2==0);
		System.out.println("print numbers greater than 3");
		print(list, n-> n>3);
	}
	public static void print(List<Integer> list, Predicate<Integer> predicate){
		for(Integer n: list)
		{
			if(predicate.test(n)){
					System.out.println(n+"  ");		}
	}
}




}
