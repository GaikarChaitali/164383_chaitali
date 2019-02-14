package Java8_Features;

import java.util.*;
import java.util.stream.*;


public class StreamExp {
	public static void main(String[] args) {


		ArrayList<Integer> l=new ArrayList<>();
		//using integers
		l.add(3);
		l.add(8);
		l.add(2);
		l.add(10);
		l.add(0);
		System.out.println(l);
		
		int count=(int) l.stream().count();
		System.out.println(count);
		int count1=(int)l.stream().filter(n->n!=2).count();
		System.out.println(count1);
		//another way
		//List<Integer> l3=Arrays.asList(5,2,3,7);

		//using string
		List<String> s=Arrays.asList("Chaitali","Ankita","Komal","Komal");
		System.out.println(s);

		//by using normal way
		for(Integer i:l){
			if(i!=2){
				System.out.println(i);
			}
		}


		//prime no using stream
		List<Integer> l3=l.stream().filter(n->n!=2).collect(Collectors.toList());
		System.out.println(l3);

		List<Integer> l1=l.stream().filter(n->n% 2==0).collect(Collectors.toList());
		System.out.println(l1);

		List<Integer> l2=l.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(l2);


		List<String> s1=s.stream().filter(n ->n!="Komal").collect(Collectors.toList());
		System.out.println(s1);
		List<String> s2=s.stream().sorted().collect(Collectors.toList());
		System.out.println(s2);


		s.stream().forEach(n->System.err.println(n));
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.println(even);

	}
}
