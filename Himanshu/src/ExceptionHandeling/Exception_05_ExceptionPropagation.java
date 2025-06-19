package ExceptionHandeling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception_05_ExceptionPropagation {
	static void m1() throws IOException {
		m2();
	}
	static void m2() throws IOException {
		FileReader f=new FileReader("C:\\Users\\himan\\OneDrive\\Desktop\\JAVA\\H.txt");
		System.out.println("reading data");
		f.close();
	}
 public static void main(String[] args) throws IOException {
	try {
		m1();
	}
	catch (FileNotFoundException e) {
		System.out.println("handeled");
	}
}
}
