package testThread;

public class Thread1 implements Runnable{

	Communicator c;
	
	public Thread1(Communicator c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.question("Alles ok?");
		c.question("Wer bist du?");
		c.question("Willst du shoppen?");
	}
}
