package JAVA_8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java_08_17_StreamAPI {
	static String res1="",res2="";
 public static void main(String[] args) {
	List<Integer> l = Arrays.asList(9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9);
	
//1.	Print Even Numbers
	 l.stream().filter(i->i%2==0).forEach(i->System.out.print(i+" "));
	 
	 System.out.println();
	 System.out.println("============");
	 
	 
//2.	Count No.Of Even Numbers
	 long even=l.stream().filter(i->i%2==0).count();
	 System.out.println(even);
	 
	 System.out.println("============");
	 
//3.    Sort In Asscending Order
	 List<Integer> asc = l.stream().sorted().toList();
	 System.out.println(asc);
	 
	 System.out.println("============");
	 
//4.   To Remove Duplicates Elements form Array
	 Object[] b = l.stream().distinct().toArray();
		System.out.println(Arrays.toString(b));
	 
	 System.out.println("============");
	 
//5.   Remove Duplicate Words From A String
	 String s = "Bangolore is a Bangolore city ";//res="";
	 String str[] = s.split(" ");
	//Local Variable can't be use inside stream here local variable act as final variable
//	 Arrays.asList(str).stream().distinct().forEach(i->res+=i);
	 Arrays.asList(str).stream().distinct().forEach(i->System.out.println(i));
	 System.out.println("===");
	 Arrays.asList(str).stream().distinct().forEach(i->res1+=i+" ");
	 System.out.println(res1);
	 
	 System.out.println("==============");
	 
//6.   Remove Duplicate Elements From A Array
	 int a[]= {9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9};
	int []b11 = Arrays.stream(a).distinct().toArray();
	System.out.println(Arrays.toString(b11));
	
	 System.out.println("==============");
	 
//7. Remove Duplicate Characters From A String
	String s1="Java Dev";
	s1.chars().distinct().forEach(i->res2+=(char)i);
	System.out.println(res2);
	
	 System.out.println("==============");
	
//8.  Occurance Of Character From A String
	String s3="Himanshu";
	Map<Object, Long> m = s3.chars().mapToObj(i->(char)i)
      .collect(Collectors.groupingBy(c->c,()->
      new LinkedHashMap<>(),Collectors.counting()));
	m.forEach((ch,i)->System.out.println(ch+":"+i));
	
	System.out.println("==============");
	
//9.  Occurance Of Element in A Given Array
	int arr[]= {9,8,7,6,5,4,3,2,1,1,2,3,4,5,6,7,8,9};
	Arrays.stream(arr).mapToObj(i->i)
	.collect(Collectors.groupingBy(c->c,Collectors.counting()))
	.forEach((el,i)->System.out.println(el+":"+i));
       System.out.println("==================");
       
//10. Print Occurance Of Word in A Given String
       String s4="Himanshu Bhusan Biswal Himanshu";
       String str1[]=s4.split(" ");
       List<String> l1= Arrays.asList(str1);
       
      Map<Object, Long> m1 = l1.stream()
     .collect(Collectors.groupingBy(c->c,Collectors.counting()));
      
      m1.forEach((st,i)->System.out.println(st+":"+i));
      
      System.out.println("============");
            
}
}
