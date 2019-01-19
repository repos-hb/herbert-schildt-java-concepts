package p1;

public class Derived extends Protection {
	Derived(){
		System.out.println("Derived constructor");
		System.out.println("i = " + i);
		//System.out.println("pri = " +pri);	ERROR
		System.out.println("pro = " + pro);
		System.out.println("pub = " + pub);
	}
}
