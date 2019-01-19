package exceptionHandling;

public class ThrowDemo {
	void meth() {
		try {
			throw new NullPointerException("thrown from meth()");
		} catch (NullPointerException e) {
			System.out.println("inside ThrowDemo.meth.catch");
			throw e;
		}
	}

}
