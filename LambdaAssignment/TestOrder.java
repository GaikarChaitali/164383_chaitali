package LambdaAssignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TestOrder {
	public static void main(String[] args) {

		ToOrder order1=new ToOrder("Watch",12000 );
		ToOrder order2=new ToOrder("Bag", 5000);
		ToOrder order3=new ToOrder("Mobile", 32000);

		ArrayList<ToOrder> list=new ArrayList<>();

		list.add(order1);
		list.add(order2);
		list.add(order3);


		System.out.println(list);
		ArrayList<ToOrder> list1=(ArrayList<ToOrder>) list.stream().filter(p->p.getItemPrice()>10000).collect(Collectors.toList());
		
		System.out.println(list1);
		System.out.println("/////////////////////////////////////////////////");
		
		list.stream().forEach(System.out::println);


	}
}
