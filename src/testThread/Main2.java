package testThread;

public class Main2 {
	
	
	public static void main(String[] args) {
		
		Communicator c = new Communicator();
		
		new Thread(new Thread2(c)).start();
		new Thread(new Thread1(c)).start();
		
		
	}
	
}

