package LambdaAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ToAppend {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>(); 
		HashMap<String, Integer> hashmap= new HashMap<>();
		hashmap.put("1BHK",10000);
		hashmap.put("2BHK",13000);
		hashmap.put("3BHK",16000);
		hashmap.put("4BHK",18000);

		System.out.println(hashmap);
		System.out.println("******************************");
		
		for (Map.Entry<String,Integer> entry : hashmap.entrySet())  
			System.out.println("for "+entry.getKey() + " rent is rs." +entry.getValue()); 


		for (Map.Entry<String,Integer> entry : hashmap.entrySet()) {
			list.add(entry.getKey()+entry.getValue());
		}
		System.out.println("******************************");
		System.out.println(list);
		
		
		
	}
}
