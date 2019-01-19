package generics;

public class NonGen {

	Object obj;
	
	NonGen(Object o){
		obj = o;
	}
	
	Object getValue(){
		return obj;
	}
	
	void showType(){
		System.out.println("type of obj is: "+obj.getClass().getName());
	}
}
