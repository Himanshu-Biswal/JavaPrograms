package D.S.A;
import java.util.LinkedHashMap;
import java.util.Map;
public class DSA_01_NumToRoman {
 public static String convert(int n) {
	 String res="";
	 Map<Integer,String>m=new LinkedHashMap<Integer, String>();
	 m.put(1, "I");
	 m.put(2, "II");
	 m.put(4, "IV");
	 m.put(5, "V");
	 m.put(9, "IX");
	 m.put(10, "X");
	 m.put(40, "XL");
	 m.put(50, "L");
	 m.put(90, "XC");
	 m.put(100, "C");
	 m.put(400, "CD");
	 m.put(500, "D");
	 m.put(900, "CM");
	 m.put(1000, "M");
	 int num[]= {1000,900,500,400,100,90,50,40,10,9,5,4,2,1};
	 for(int val:num) {
		 while(n>=val) {
			 res+=m.get(val);
//			 res+=",";
			 n=n-val;
		 }
	 }
	 return res;
 }
 public static void main(String[] args) {
	int n=1475;
	System.out.println(convert(n));
}
}
