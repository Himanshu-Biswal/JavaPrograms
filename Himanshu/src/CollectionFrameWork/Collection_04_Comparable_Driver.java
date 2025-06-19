package CollectionFrameWork;

import java.util.Arrays;
public class Collection_04_Comparable_Driver {
 public static void main(String[] args) {
Collection_04_Comparable_Student s1=new Collection_04_Comparable_Student("Himanshu", 24, 79);
Collection_04_Comparable_Student s2=new Collection_04_Comparable_Student("Madhu", 21, 77);
Collection_04_Comparable_Student s3=new Collection_04_Comparable_Student("Karan", 23, 89);
Collection_04_Comparable_Student s4=new Collection_04_Comparable_Student("Nira", 23, 82);
Collection_04_Comparable_Student s5=new Collection_04_Comparable_Student("Bikash", 24, 69);

Collection_04_Comparable_Student []s= {s1,s2,s3,s4,s5};

Arrays.sort(s);

for(Collection_04_Comparable_Student st:s) {
	System.out.println(st);
}
}
}
