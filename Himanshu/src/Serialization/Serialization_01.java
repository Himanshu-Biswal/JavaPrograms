package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization_01 {
 public static void main(String[] args) throws IOException {
	Student s = new Student("Himanshu", 23, 07, 773576245);
	
	FileOutputStream f=new FileOutputStream("C:\\Users\\himan\\OneDrive\\Desktop\\JAVA\\H.txt");
	ObjectOutputStream o=new ObjectOutputStream(f);
	o.writeObject(s);
	System.out.println("Serialization");
	o.close();
}
}
