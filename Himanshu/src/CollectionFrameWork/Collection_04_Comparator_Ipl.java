package CollectionFrameWork;

import java.util.Arrays;
public class Collection_04_Comparator_Ipl {
 public static void main(String[] args) {
Collection_04_Comparator_Team t1=new Collection_04_Comparator_Team("CSK", 2, 10);
Collection_04_Comparator_Team t2=new Collection_04_Comparator_Team("RCB", 8, 3);
Collection_04_Comparator_Team t3=new Collection_04_Comparator_Team("DC ", 8, 1);
Collection_04_Comparator_Team t4=new Collection_04_Comparator_Team("LSG", 4, 7);
Collection_04_Comparator_Team t5=new Collection_04_Comparator_Team("SRH", 2, 9);
Collection_04_Comparator_Team t6=new Collection_04_Comparator_Team("MI ", 2, 8);
Collection_04_Comparator_Team t7=new Collection_04_Comparator_Team("KKR", 8, 2);
Collection_04_Comparator_Team t8=new Collection_04_Comparator_Team("RR ", 4, 5);
Collection_04_Comparator_Team t9=new Collection_04_Comparator_Team("PSK", 6, 4);
Collection_04_Comparator_Team t10=new Collection_04_Comparator_Team("GT ", 4,6);

Collection_04_Comparator_Team []t= {t1,t2,t3,t4,t5,t6,t7,t8,t9,t10};

Arrays.sort(t,new Collection_04_Comparator_SortByRank());

for(Collection_04_Comparator_Team tm:t) {
	System.out.println(tm);
}
}
}
