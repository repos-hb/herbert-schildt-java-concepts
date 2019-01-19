package p1;

public class SamePackage {
	SamePackage(){
		System.out.println("SamePackage constructor");
		Protection protection = new Protection();
		System.out.println("i = " + protection.i);
		//System.out.println("pri = " +protection.pri);		ERROR
		System.out.println("pro = " + protection.pro);
		System.out.println("pub = " + protection.pub);
	}
}
