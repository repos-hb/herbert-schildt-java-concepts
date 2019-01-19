package multithreading;

public class NewThread implements Runnable {
	Thread th;

	public NewThread() {
		th = new Thread(this, "Child thread");
		System.out.println(th.getName() + " " + th);
		th.start();
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

	public void meth() {
		System.out.println("this is a dummy method");
	}

}
