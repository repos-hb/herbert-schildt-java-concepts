package p1;

public class Protection {
	int i=2;
	public int pub=4;
	private int pri=8;
	protected int pro=16;
	
	public Protection(){
		System.out.println("base constructor");
		System.out.println("i = " + i);
		System.out.println("pri = " +pri);
		System.out.println("pro = " + pro);
		System.out.println("pub = " + pub);
	}
}
