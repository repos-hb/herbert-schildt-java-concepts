package multithreading.interThreadComm;

public class PC {

	public static void main(String a[]) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

		System.out.println("Press Control-C to stop.");
	}

}
