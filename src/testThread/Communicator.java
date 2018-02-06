package testThread;

public class Communicator {

	boolean flag = false;

	public synchronized void question(String msg) {
		if (flag) {
			try {
				// Thread Schläft
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(msg);
		flag = true;
		// Thread wird wieder gestartet
		notify();
	}

	public synchronized void answer(String msg) {
		if (!flag) {
			try {
				// Thread Schläft
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println(msg);
		flag = false;
		// Thread wird wieder gestartet
		notify();

	}
}
