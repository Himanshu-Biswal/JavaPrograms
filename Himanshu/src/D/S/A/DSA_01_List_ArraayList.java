 package D.S.A;

// add,remove,addPos,size,isEmpty,increase,get
public class DSA_01_List_ArraayList {
	int count = 0;
	Object o[] = new Object[10];

	public void add(Object element) {
		if (count >= o.length)
			increase();
		o[count++] = element;
	}

	private void increase() {
		Object a[] = new Object[(o.length * 3) / 2 + 1];
		for (int i = 0; i < o.length; i++) {
			a[i] = o[i];
		}
		o = a;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		return count == 0;
	}

	public Object get(int index) {
		if (index < 0 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		return o[index];
	}

	public void add(Object element, int index) {
		if (index < 0 || index > size())
			throw new ArrayIndexOutOfBoundsException();
		if (count >= o.length)
			increase();
		for (int i = size(); i > index; i--) {
			o[i] = o[i - 1];
		}
		o[index] = element;
		count++;
	}

	public void remove(int index) {
		if (index < 0 || index >= size())
			throw new ArrayIndexOutOfBoundsException();
		for (int i = index; i < size(); i++) {
			o[i] = o[i + 1];
		}
		count--;
	}
	public void display() {
		for(int i=0;i<size();i++) {
			System.out.println(o[i]);
		}
	}
}
