package abstractMethods;

public class Child extends Parent {

	@Override
	int sum() {
		// TODO Auto-generated method stub
		return super.i + super.j;
	}

	@Override
	int mult() {
		// TODO Auto-generated method stub
		return i * j;
	}

	int divide() {
		// TODO Auto-generated method stub
		return i / j;
	}
}
