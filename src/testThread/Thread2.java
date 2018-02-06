package testThread;

public class Thread2 implements Runnable {

	Communicator c;

	public Thread2(Communicator c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.answer("gut");
		c.answer("langweilig");
		c.answer("%hsdjr453Äö");
	}

}
