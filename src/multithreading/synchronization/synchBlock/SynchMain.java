package multithreading.synchronization.synchBlock;

public class SynchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Call target = new Call();
		Caller ob1 = new Caller("hello", target);
		Caller ob2 = new Caller("synchronized", target);
		Caller ob3 = new Caller("world", target);
		
		try {
			ob1.th.join();
			ob2.th.join();
			ob3.th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("interrupted");
		}

	}

}
