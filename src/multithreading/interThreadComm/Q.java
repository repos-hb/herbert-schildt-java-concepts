package multithreading.interThreadComm;

public class Q {
	int value;
	boolean setVal = false;

	synchronized public int getValue() {
		while (!setVal) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		setVal = false;
		System.out.println("Got: " + value);
		notify();
		return value;

	}

	synchronized public void putValue(int value) {
		while (setVal) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		setVal = true;
		this.value = value;
		System.out.println("Put: " + value);
		notify();
	}
}
