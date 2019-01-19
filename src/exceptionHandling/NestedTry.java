package exceptionHandling;

public class NestedTry {
	public void meth(){
		try{
			int res = 22 / 0;
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("inside ArrayIndexOutOfBoundsException");
		}
	}
}
