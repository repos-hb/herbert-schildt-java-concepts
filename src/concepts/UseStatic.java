package concepts;

public class UseStatic {

	static int a = 2;
	static double b;

	static void meth(int x) {
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		System.out.println("x =" + x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("entering main...");
		meth(56);
	}

	static {
		System.out.println("static block...");
		b = 22 / 7.0;
	}

}
