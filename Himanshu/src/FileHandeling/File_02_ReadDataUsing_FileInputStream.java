package FileHandeling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File_02_ReadDataUsing_FileInputStream {
 public static void main(String[] args)  throws IOException{
	File f=new File("C:\\\\Users\\\\himan\\\\OneDrive\\\\Desktop\\\\JAVA\\\\A.txt");
	FileInputStream f1=new FileInputStream(f);
//	System.out.println(f.canRead());
	if(f.canRead()) {
		int n=f1.read();
		while(n!=-1) {
			System.out.print((char)n);
			n=f1.read();
		}
	}
	else System.out.println("can't Read Data");
	f1.close();
}
}
