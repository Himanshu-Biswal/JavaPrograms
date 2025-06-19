package CollectionFrameWork;

import java.util.Comparator;

public class Collection_04_Comparator_SortByRank implements Comparator<Collection_04_Comparator_Team> {

	@Override
	public int compare(Collection_04_Comparator_Team o1, Collection_04_Comparator_Team o2) {
		return o1.rank-o2.rank;
	}
 
}
