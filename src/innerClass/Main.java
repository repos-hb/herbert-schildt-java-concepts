package innerClass;

import innerClass.Outer.Inner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer obj = new Outer();
		obj.displayInner();
		System.out.println("creating inner class instance using outer class ref");
		Outer.Inner innerObj = obj.new Inner();
		innerObj.displayOuter();
	}

}
