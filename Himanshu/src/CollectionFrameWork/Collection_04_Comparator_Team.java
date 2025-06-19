package CollectionFrameWork;

public class Collection_04_Comparator_Team {
 String name;
 int point;
 int rank;
 Collection_04_Comparator_Team(String name, int point, int rank){
	 this.name=name;
	 this.point=point;
	 this.rank=rank;
 }
 
 public String toString() {
		return "[ Team Name: "+name+" Point: "+point+
				" rank: "+rank+" ]";
	}
}
