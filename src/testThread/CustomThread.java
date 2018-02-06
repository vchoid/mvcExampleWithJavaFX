package testThread;

public class CustomThread extends Thread{

	String name;
	Blubb b;
	boolean c;
	
	CustomThread(String name, Blubb b, boolean c) {
		this.name = name;
		this.b = b;
		this.c = c;
		
		start();
	}
	
	
	@Override
	public void run() {
		System.out.println("Thread: " + name);
		for (int i = 0; i < 5; i++) {
			if(c) {
				b.firstThread();
			}else {
				b.secThread();
			}
		}
		System.out.println("Ende des Threads: " + name);
	}
	
}
