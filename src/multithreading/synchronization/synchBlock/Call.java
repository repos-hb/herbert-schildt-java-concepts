package multithreading.synchronization.synchBlock;

public class Call {
	 public void callme(String msg){
		System.out.println("["+msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
		}
		System.out.println("]");
	}
}
