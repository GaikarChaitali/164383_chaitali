package StreamAssignment;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestTrader {
	private static Function getName;

	public static void main(String[] args) {

		Trader trader=new Trader("nikhil", "pune");
		Trader trader2=new Trader("ajinkya", "mumbai");
		Trader trader3=new Trader("amey", "pune");
		Trader trader4=new Trader("sahil", "indore");
		Trader trader5=new Trader("kajal", "delhi");

		Transaction transaction1=new Transaction(trader, 1996, 2000);
		Transaction transaction2=new Transaction(trader2, 2011, 23000);
		Transaction transaction3=new Transaction(trader3, 2011, 4000);
		Transaction transaction4=new Transaction(trader4, 2000, 4563);
		Transaction transaction5=new Transaction(trader5, 2011,  500);

		List<Transaction> list=new ArrayList<Transaction>();
		list.add(transaction1);
		list.add(transaction2);
		list.add(transaction3);
		list.add(transaction4);
		list.add(transaction5);
		
		
		
		System.out.println("__________________Original data__________________");
		for(Transaction t:list){
			System.out.println(t);
		}


		System.out.println("                            ");
		System.out.println("_______________Que.8_________________");
		list.stream().filter(n->n.getYear()==2011).sorted(Comparator.comparing(Transaction::getValue)).forEach(System.out::println);


		System.out.println("                            ");
		System.out.println("_______________Que.9_________________");
		list.stream().map(s->s.trader.getCity()).distinct().forEach(System.out::println);


		System.out.println("                            ");
		System.out.println("_______________Que.10_________________");
		list.stream().filter(s->s.trader.getCity()=="pune").map(s->s.trader.getName()).sorted().forEach(System.out::println);


		System.out.println("                            ");
		System.out.println("_______________Que.11_________________");
		list.stream().map(s->s.trader.getName()).sorted().forEach(System.out::println);


		System.out.println("                            ");
		System.out.println("_______________Que.12_________________");
		list.stream().filter(s->s.trader.getCity()=="indore").forEach(s->System.out.println(s.trader.getName()+" is from "+s.trader.getCity()));

		System.out.println("                            ");
		System.out.println("_______________Que.13_________________");
		list.stream().filter(s->s.trader.getCity()=="delhi").forEach(s->System.out.println(s.getValue()));


		System.out.println("                            ");
		System.out.println("_______________Que.14_________________");
		System.out.println(list.stream().max(Comparator.comparing(Transaction::getValue)).get().getValue());


		System.out.println("                            ");
		System.out.println("_______________Que.15_________________");
		System.out.println(list.stream().min(Comparator.comparing(Transaction::getValue)).get().getValue());
	}
}
