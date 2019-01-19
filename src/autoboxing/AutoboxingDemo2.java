package autoboxing;

public class AutoboxingDemo2 {

	static Integer getInt(Integer i) { // param is autoboxing
		return i;
	}

	public static void main(String a[]) {
		Integer in = 250;	// autoboxed 
		Integer num = getInt(in);	// return value is autoboxed
		System.out.println(num);
	}

}
