package inheritance;

public class Child extends Parent {

	public String msg;

	public Child(int i, int j) {
		super(i, j);
		msg = "this is subclass";
	}

	public Child() {
		super();
		msg = "this is subclass-noarg constructor";
	}

	public void showMessage() {
		System.out.println(msg);
	}

}
