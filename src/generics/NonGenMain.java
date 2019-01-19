package generics;

public class NonGenMain {

	public static void main(String[] args) {
		
		NonGen iOb = new NonGen(58);
		
		iOb.showType();
		
		int n = (int) iOb.getValue();
		System.out.println(n);
		
		NonGen sOb = new NonGen("test");
		
		sOb.showType();
		String st = sOb.getValue().toString();
		
		// kechal here, type safety
		iOb = sOb;
		System.out.println(iOb.getValue());

	}

}
