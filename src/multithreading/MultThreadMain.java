package multithreading;

public class MultThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MultThread("THREAD 1");
		new MultThread("THREAD 2");
		new MultThread("THREAD 3");

		try {
			//wait for other thread to complete
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Exiting main thread");
	}

}
