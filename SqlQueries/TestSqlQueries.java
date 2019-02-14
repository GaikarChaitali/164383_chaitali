package SqlQueries;

import java.util.ArrayList;
import java.util.List;

public class TestSqlQueries {

	public static void main(String[] args) {

SqlQuery query=new SqlQuery(134, "Chaitali", "Mumbai","Account");
SqlQuery query2=new SqlQuery(143,"Mansi","Pune","Manager");
SqlQuery query3=new SqlQuery(125,"Kirti","Delhi","Clerk");

List<SqlQuery> list=new ArrayList<SqlQuery>();
list.add(query);
list.add(query2);
list.add(query3);


System.out.println(list);

list.stream().map(s->s.getDeptName()).forEach(System.out::println);
System.out.println("                                         ");
list.stream().map(s->s.getEname()).forEach(System.out::println);
System.out.println("                                         ");
list.stream().filter(s->s.getDeptNo()==134).map(s->s.getEname()).forEach(System.out::println);
System.out.println("                                         ");
list.stream().filter(s->s.getDeptName()=="Clerk").forEach(System.out::println);
System.out.println("                                         ");
list.stream().filter(s->s.getDeptNo()>=100).forEach(s->System.out.println(s.getDeptName()+"  "+s.getEname()));
System.out.println("                                         ");

	}

}
