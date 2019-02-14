package LambdaAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ToPrintString {
public static void main(String[] args) {
	List<String> list=Arrays.asList("pooja","chetana","kalyani","shruti");
	
	
	//Consumer<String> c=a-> System.out.println(a);
	
	List<Character> list1=(List<Character>) list.stream().map(n-> n.charAt(0)).collect(Collectors.toList());
	System.out.println(list1);
	
	
	//c.accept();
}
}
