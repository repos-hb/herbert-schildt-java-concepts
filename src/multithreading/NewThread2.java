package multithreading;

public class NewThread2 extends Thread {
	//Thread th;

	public NewThread2() {
		super("Child thread");
		System.out.println(getName() + " " + currentThread());
		start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Thread.currentThread().sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child thread interrupted");
		}
		System.out.println("Exiting child thread");

	}

}
