package LambdaAssignment;

import java.util.ArrayList;

public class LengthOfString {
public static void main(String[] args) {
	ArrayList<String> arrayList=new ArrayList<String>();
	arrayList.add("om");
	arrayList.add("swati");                    //odd length so remove
	arrayList.add("chaitali");
	
	
	System.out.println(arrayList);
	
	arrayList.removeIf(n-> (n.length()%2)!=0);
	
	for (String array : arrayList) { 
        System.out.println(array); 
    } 
}
}
