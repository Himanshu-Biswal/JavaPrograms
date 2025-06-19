package FileHandeling;
import java.io.*;
public class File_04_WriteDataUsing_CharcterStream {
 public static void main(String[] args) throws IOException {
	FileWriter f= new FileWriter("C:\\Users\\himan\\OneDrive\\Desktop\\JAVA\\H.txt");
	f.write("Himanshu\n");
	f.write("Bhusan\n");
	f.write("Biswal\n");
	f.close();
	
	
}
}
