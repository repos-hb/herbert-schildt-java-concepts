package concepts;

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		varargsMeth(9, 5, 7, 3);
		varargsMeth();
		varargsMeth(true, 2);
		varargsMeth(false, 6, 8);
	}

	public static void varargsMeth(int... vals) {
		System.out.print("no of params " + vals.length + ", having params ");
		for (int i : vals) {
			System.out.println(i);
		}
	}

	// overloading varargsMeth
	public static void varargsMeth(boolean flag, int... vals) {

		if (flag) {
			System.out.print("no of params " + vals.length + ", having params ");
			for (int i : vals) {
				System.out.println(i);
			}
		} else
			System.out.println("fokka");
	}

}
