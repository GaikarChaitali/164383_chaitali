package StreamAssignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class TestNews {
	public static void main(String[] args) {
		News news1=new News(124, "Chaitali", "Simer", "Budget of project???");
		News news2=new News(136, "Poojitha", "Priti", "Excellent");
		News news3=new News(174, "Abhay", "Urvi", "Expected budget");
		News news4=new News(124, "Swati", "mallika", "good");
		News news5=new News(101,"swati","Priti","What is the budget of your project");
		News news6=new News(111,"chaitali","Priti","Nice");
		News news7=new News(111,"chaitali","Priti","poor");
		News news8=new News(121,"Priti","swati","Nice");
		News news9=new News(121,"Priti","urvi","okay");
		
		
		List<News> list=new ArrayList<>();
		list.add(news1);
		list.add(news2);
		list.add(news3);
		list.add(news4);
		list.add(news5);
		list.add(news6);
		list.add(news7);
		list.add(news8);
		list.add(news9);
		
		for(News n:list){
			System.out.println(n);
		}

   System.out.println("______________que.4________________");
   System.out.println(list.stream().max(Comparator.comparing(News::getCommentByUser)).get().getNewsId());
   
   
   System.out.println("______________que.5________________");
   long comment=list.stream().filter(str->str.getComment().contains("budget")).count();
   System.out.println("Occurence of budget in comment:"+comment);
   
   
   System.out.println("______________que.6________________");
   System.out.println(list.stream().max(Comparator.comparing(News::getComment)).get().getCommentByUser());
   
   
   
   System.out.println("______________que.7________________");
   Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(i->i.getCommentByUser(), Collectors.counting())); 
   System.out.println("Comments by user"+map);

		
	}
}
