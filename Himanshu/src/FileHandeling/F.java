package FileHandeling;
 import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class F {
 public static void main(String[] args) throws IOException {
	File f=new File("C:\\\\Users\\\\himan\\\\OneDrive\\\\Desktop\\\\JAVA\\\\A.txt");
	FileOutputStream f1=new FileOutputStream(f);
	String s="Himashu";
	byte b[]=s.getBytes();
	if(f.canWrite()) {
		f1.write(b);
	}
	f1.close();
}
}
