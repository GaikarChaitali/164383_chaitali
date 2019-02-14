package Java8_Features;

public class DemoOfLambda {
	public static void main(String[] args) {
		print(s ->s.length());
		print2((int a,int b)-> a+b);

		/*MyDemo addition=s-> s.length();
		demo2 addition2=(int a, int b)-> a+b;
		
		
		System.out.println(addition2.add(5,4));
		System.out.println(addition.getLength("chaitali"));*/
		
		
		
		Thread myThread=new Thread(()-> System.out.println("output printed"));
		myThread.run();
		
	}
	
	public static void print(MyDemo m){
		System.out.println(m.getLength("chaitali"));
	} 
		
	public static void print2(demo2 d){
		System.out.println(d.add(5,4));
	} 
		interface MyDemo{
			int getLength(String s);
		
	}
		
		
		interface demo2{
			int add(int a, int b);
		}
}

