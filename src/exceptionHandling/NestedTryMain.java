package exceptionHandling;

public class NestedTryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedTry obj = new NestedTry();
		try{
			obj.meth();
		}catch(ArithmeticException ex){
			System.out.println("inside ArithmeticException");
		}

	}

}
