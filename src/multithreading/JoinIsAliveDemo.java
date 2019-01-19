package multithreading;

public class JoinIsAliveDemo implements Runnable {
	String name;
	Thread th;

	public JoinIsAliveDemo(String s) {
		// TODO Auto-generated constructor stub
		this.name = s;
		th = new Thread(this, name);
		System.out.println("thread created:" + th);
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(th.getName() + ":" + i);
				th.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		} finally {
			System.out.println(name + " exiting.");
		}

	}

}
