package LambdaAssignment;
import java.util.*;
import java.util.function.*;

public class FunctionalInterfaces {
	public static void main(String[] args) {

		/*List<String> arrayList= Arrays.asList("Chaitatli","Komal","Ankita","Kajal","Kabir");

		Predicate<String> p = (s)->s.startsWith("K");

		for (String s1:arrayList) 
		{ 
                if (p.test(s1)) 
				System.out.println(s1); 
		} */

		List<Integer> list=Arrays.asList(3,25,4,13,92,5,73);

		System.out.println("Enter number");
		Scanner scanner= new Scanner(System.in);
		int num=scanner.nextInt();

		Predicate<Integer> p = a-> a==10;
		System.out.println(p.test(num));

		Function<Integer, Integer> f=a-> a*a*a;
		System.out.println(f.apply(num));

		Consumer<Integer> c=a-> System.out.println(a);
		c.accept(num);

		Supplier<Number> s=() ->  Math.random();
		System.out.println(s.get());
	}
}
