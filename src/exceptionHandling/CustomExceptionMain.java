package exceptionHandling;

public class CustomExceptionMain {

	static void meth(int i) throws CustomException{
		System.out.println("inside CustomExceptionMain.meth");
		if(i>10)
			throw new CustomException(i);
		System.out.println("normal exit from CustomException.meth");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			meth(2);
			meth(12);
		} catch (CustomException e) {
			System.out.println("inside CustomExceptionMain.main.catch");
			System.out.println(e);
		}

	}

}
