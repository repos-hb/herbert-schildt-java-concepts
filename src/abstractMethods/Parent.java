package abstractMethods;

public abstract class Parent {
	int i = 3, j = 5;

	void display() {
		System.out.println("i= " + i);
		System.out.println("j= " + j);
	}
	
	abstract int sum();
	abstract int mult();
}
