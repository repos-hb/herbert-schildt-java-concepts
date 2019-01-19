package generics;

public class GenMain {

	public static void main(String[] args) {
		
		Gen genInt = new Gen<Integer>(61);
		
		genInt.showType();
		
		int v = (int) genInt.getValue();
		System.out.println(v);
		
		Gen genStr = new Gen<String>("test");
		genStr.showType();
		
		String st = genStr.getValue().toString();
		System.out.println(st);
		
//		genInt = genStr;
		genStr = genInt;
		System.out.println(genInt.getValue());
		System.out.println(genStr.getValue());

	}

}
