package exceptionHandling;

public class ThrowsDemo {
	
	static void meth() throws IllegalAccessException{
		System.out.println("inside ThrowsDemo.meth");
		throw new IllegalAccessException("thrown from meth()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			meth();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
