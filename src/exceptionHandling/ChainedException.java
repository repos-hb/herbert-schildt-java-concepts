package exceptionHandling;

import java.io.IOException;

public class ChainedException {
	static void meth() throws IOException {
		IOException obj = new IOException("top layer exception");
		obj.initCause(new ArithmeticException("causing exception/bottom layer exception"));
		throw obj;
	}

	public static void main(String[] args) {
		try {
			meth();
		} catch (IOException e) {
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
}
