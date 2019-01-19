package exceptionHandling;

public class CustomException extends RuntimeException{

	private int no;

	public CustomException(int no) {
		this.no = no;
	}
	
	public String toString(){
		return "CustomException[" + no + "]";
	}
}
