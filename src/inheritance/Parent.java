package inheritance;

public class Parent {

	public int i, j;

	private int k;

	public Parent(int i, int j) {
		this.i = i;
		this.j = j;
	}

	public Parent() {
		this.i = 1;
		this.j = 1;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public void showMessage() {
		System.out.println("this is superclass");
	}

	public int sum() {
		return i + j;
	}
}
