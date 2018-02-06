package testThread;

public class Blubb {

	boolean flag = false;
	boolean flag2 = true;
	
	public synchronized void firstThread() {
		if(flag2) {
			try {
				// Thread Schläft
				System.out.println("2Rrrr");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			if(flag) {
				try {
					// Thread Schläft
					System.out.println("1Rrrr");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		
		System.out.println("Ich bin der Erste");
		flag = true;
		flag2 = true;
		// Thread wird wieder gestartet
		notify();
	}
	
	public synchronized void secThread() {
		if(!flag2) {
			try {
				// Thread Schläft
				System.out.println("2Rrrr2");
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			if(!flag) {
				try {
					// Thread Schläft
					System.out.println("1Rrrr2");
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} 
		
		System.out.println("Ich bin der Zweite");
		flag = false;
		flag2 = false;
		// Thread wird wieder gestartet
		notify();
		
	}
	
}
