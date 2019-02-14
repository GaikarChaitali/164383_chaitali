package Java8_Features;

public class TestDemo {
	public static void main(String[] args) {
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("running");		
			}
		};
		Thread thread=new Thread(r);
		thread.start();
		}
	}

