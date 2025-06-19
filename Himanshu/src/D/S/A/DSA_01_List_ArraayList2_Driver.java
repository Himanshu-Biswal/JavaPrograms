package D.S.A;

public class DSA_01_List_ArraayList2_Driver {
 public static void main(String[] args) {
	 DSA_01_List_ArraayList l=new DSA_01_List_ArraayList();
	 l.add(10);
	 l.add(20);
	 l.add(30);
     l.add("Ten");
     l.add("Twenty");
     l.add("Thirty");
	 l.add("King", 6);
	 l.add("Thala", 7);
//	 for(int i=0;i<l.size();i++) {
//		 System.out.println(l.get(i));
//	 }
//	 System.out.println(l.size());
//	 l.remove(8);
	 System.out.println("============");
//	 for(int i=0;i<l.size();i++) {
//		 System.out.println(l.get(i));
//	 }
	 l.display();
}
}
