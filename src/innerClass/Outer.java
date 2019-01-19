package innerClass;

public class Outer {
	public int i = 5;
	private int j;

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}

	public void displayInner() {
		Inner obj = new Inner();	
		obj.setL(834);
		System.out.println("k = " + obj.k);
		System.out.println("l = " + obj.getL());
		System.out.println("calling inner class method...");
		obj.displayOuter();
	}

	// inner class
	class Inner {
		public int k = 7;
		private int l;

		public int getL() {
			return l;
		}

		public void setL(int l) {
			this.l = l;
		}

		public void displayOuter() {
			System.out.println("i = " + i);
			j = 99; // accessing private member of enclosing class
			System.out.println("j = " + getJ());
		}
	}
}
