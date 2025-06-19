package FileHandeling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_05_ReadingDataUsing_BufferReader {
 public static void main(String[] args) throws IOException {
	FileReader f=new FileReader("C:\\\\Users\\\\himan\\\\OneDrive\\\\Desktop\\\\JAVA\\\\H.txt");
	try(BufferedReader bf=new BufferedReader(f)){
		String s=bf.readLine();
		while(s!=null) {
			System.out.println(s);
			s=bf.readLine();
		}
	}
}
}
