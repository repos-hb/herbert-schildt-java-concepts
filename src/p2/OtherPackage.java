package p2;

import p1.Protection;

public class OtherPackage {
	OtherPackage(){
		Protection protection = new Protection();
		System.out.println("other package constructor");
//		System.out.println("i = " + protection.i);			ERROR
//		System.out.println("pri = " +protection.pri);		ERROR
//		System.out.println("pro = " + protection.pro);		ERROR
		System.out.println("pub = " + protection.pub);
	}

}
