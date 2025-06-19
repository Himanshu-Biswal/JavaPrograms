package FileHandeling;
import java.io.IOException;
//import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.File;

public class File_03_WriteDataUsing_FileInputStream {
 public static void main(String[] args) throws IOException    {
	File file=new File("C:\\Users\\himan\\OneDrive\\Desktop\\JAVA\\H.txt");
//	System.out.println(f.createNewFile());
	FileOutputStream f=new FileOutputStream(file);
	System.out.println(file.canWrite());
	String s="himanshu";
	byte b[]=s.getBytes();
	if(file.canWrite()) {
		f.write(b);
	}
	else System.out.println("can't write");
	f.close();
}
}
