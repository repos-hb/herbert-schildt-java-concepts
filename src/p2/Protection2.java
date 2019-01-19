package p2;

import p1.Protection;

public class Protection2 extends Protection {
	Protection2(){
		System.out.println("derived other package constructor");
//		System.out.println("i = " + i);	
//		System.out.println("pri = " +pri);
		System.out.println("pro = " + pro);
		System.out.println("pub = " + pub);
	}
}
