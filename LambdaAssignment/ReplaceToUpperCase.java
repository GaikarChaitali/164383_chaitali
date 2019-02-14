package LambdaAssignment;

import java.util.Arrays;
import java.util.List;

public class ReplaceToUpperCase {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("simer","sarita","suraj","sameer");

		list.replaceAll(s->s.toUpperCase());
		System.out.println(list);
	}
}
