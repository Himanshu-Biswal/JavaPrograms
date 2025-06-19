package FileHandeling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class File_06_WriteDataUsing_BufferReader {
 public static void main(String[] args) throws IOException {
	 FileWriter f=new FileWriter("C:\\\\Users\\\\himan\\\\OneDrive\\\\Desktop\\\\JAVA\\\\H.txt",true);
		try(BufferedWriter bf=new BufferedWriter(f)){
			bf.write("Himanshu");
			bf.newLine();
			bf.write("Bhusan");
			bf.newLine();
			bf.write("Biswal");
			bf.newLine();
			}
		
}
}
