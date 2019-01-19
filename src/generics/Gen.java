package generics;

public class Gen<T> {

	T t;

	Gen(T obj) {
		t = obj;
	}

	T getValue() {
		return t;
	}

	void showType() {
		System.out.println("type of t is: " + t.getClass().getName());
	}
}
