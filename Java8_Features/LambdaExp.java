package Java8_Features;

import java.util.*;

public class LambdaExp {
public static void main(String[] args) {
	
	List<Person> person=new ArrayList<>();
	Person person1=new Person(45,"ram", "kapur");
	Person person2=new Person(54, "sima", "shetty");
	Person person3=new Person(62, "gita", "sharma");
	
	
	person.add(person3);
	person.add(person2);
	person.add(person1);
	
	
	
	}


}
