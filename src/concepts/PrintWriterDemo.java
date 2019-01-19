package concepts;

import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println("hello world");

	}

}
