
package FileHandeling;

import java.io.File;
import java.io.IOException;

public class File_01 {
 public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\himan\\OneDrive\\Desktop\\JAVA\\A.txt");
//	Creates the directory named by this abstract pathname.
//	System.out.println(f.mkdir()); 
//	System.out.println(f.createNewFile());
	System.out.println(f.canExecute());
	System.out.println(f.canRead());
	System.out.println(f.canWrite());
	
	System.out.println(f.getAbsolutePath());
	File f1=new File("C:\\Users\\himan\\OneDrive\\Desktop\\JAVA\\B.txt");
	System.out.println(f.renameTo(f1));
}
}
