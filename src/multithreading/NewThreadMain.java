package multithreading;

public class NewThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NewThread().meth();

		Thread.currentThread().setName("Main thread");
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Thread.currentThread().sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Exiting main thread");

	}

}
