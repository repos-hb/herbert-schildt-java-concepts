package multithreading;

public class JoinIsAliveDemoMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		JoinIsAliveDemo obj1 = new JoinIsAliveDemo("one");
		JoinIsAliveDemo obj2 = new JoinIsAliveDemo("two");
		JoinIsAliveDemo obj3 = new JoinIsAliveDemo("three");

		Thread.sleep(200);

		System.out.println("Thread One is alive:" + obj1.th.isAlive());
		System.out.println("Thread Two is alive:" + obj2.th.isAlive());
		System.out.println("Thread Three is alive:" + obj3.th.isAlive());

		// waiting for other threads to end
		obj1.th.join();
		obj2.th.join();
		obj3.th.join();

		System.out.println("Thread One is alive:" + obj1.th.isAlive());
		System.out.println("Thread Two is alive:" + obj2.th.isAlive());
		System.out.println("Thread Three is alive:" + obj3.th.isAlive());

		System.out.println("Main thread exiting.");

	}

}
