package multithreading;

public class CurrentThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = Thread.currentThread();Thread th2 = new Thread("hhhh");
		System.out.println(th);
		
		//manipulating
		th.setName("my thread");
		System.out.println(th);
		
		System.out.println("current state is "+th.getState());
		
		for(int i=0;i<5;i++){
			try {
				System.out.println(i+1);
				if(i==3)
					th.interrupt();
				th.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(th.getName()+" is interrupted");
				//break;
			}
		}
 

	}

}
