package exceptionHandling;

public class ThrowDemoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowDemo obj = new ThrowDemo();
		try{
			obj.meth();
		}catch(NullPointerException e){
			System.out.println("inside ThrowDemoMain.main.catch\n"+e.getMessage());
			System.out.println(e.getCause());
		}
		
	}

}
