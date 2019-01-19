package abstractMethods;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent;
		Child child = new Child();
		parent=child;
		
		parent.display();
		System.out.println(parent.sum());
		
	}

}
