package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent = new Parent(2, 6);
		Parent parentRef= new Child();
		
		Child child = new Child(4, 7);
		//Child childRef = new Parent();
		
		parent.showMessage();
		child.showMessage();
		
		//System.out.println(childRef.sum());
		
		parentRef.showMessage();
		//childRef.showMessage();
		
		parentRef = parent;
		parentRef.showMessage();
	}

}
