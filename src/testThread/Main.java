package testThread;

public class Main {

	public static void main(String[] args) {
		
		Blubb b = new Blubb();
		
		CustomThread c1 = new CustomThread(" Tom", b, true);
		CustomThread c2 = new CustomThread(" Chris", b, false);

		try {
			c1.join();
			c2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ProgrammENDE");
	}
}
