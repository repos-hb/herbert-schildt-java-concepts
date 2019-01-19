package multithreading;

public class MultThread implements Runnable {
	String name;
	Thread th;

	MultThread(String s) {
		this.name = s;
		th = new Thread(this, name);
		System.out.println(th.getName() + " is created.");
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

}
