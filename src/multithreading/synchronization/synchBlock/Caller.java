package multithreading.synchronization.synchBlock;

public class Caller implements Runnable {
	String msg;
	Call target;
	Thread th;

	public Caller(String msg, Call target) {
		this.msg = msg;
		this.target = target;
		th = new Thread(this, msg);
		th.start();
	}

	@Override
	public void run() {
		synchronized (target) {
			target.callme(msg);
		}
	}

}
