package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {
 public static void main(String[] args) throws IOException, ClassNotFoundException {
	
	FileInputStream f=new FileInputStream("C:\\Users\\himan\\OneDrive\\Desktop\\JAVA\\H.txt");
	
	try(ObjectInputStream o=new ObjectInputStream(f)){	
		Student s1=(Student)o.readObject();
		System.out.println(s1);
		System.out.println("DeSerialization Done");
	}
	
	
}
}