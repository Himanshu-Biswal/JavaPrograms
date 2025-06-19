package D.S.A;

class ArrayListStack{
	int count=0;
	Object o[]=new Object[10];
	public void push(Object ele) {
		if(count>=o.length)increase();
		o[count++]=ele;
	}
	private void increase() {
		Object a[]=new Object[10+6];
		for(int i=0;i<o.length;i++) {
			a[i]=o[i];
		}
		o=a;
	}
	public int size() {
		 return count;
	 }
	 public boolean isEmpty() {
		 return count==0;
	 }
	public Object peek() {
		return o[size()-1];
	}
	public void remove() {
		for (int i = size()-1; i < size(); i++) {
			o[i] = o[i + 1];
//			System.out.println(o[i]);
		}
		count--;
		
	}
	public Object pop() {
	    if (isEmpty()) {
	        throw new RuntimeException("Stack is empty");
	    }
	    Object top = o[size() - 1];
	    count--;
	    return top;
	}

}
public class DSA_01_List_Stack3_UsingArrayList {
 public static void main(String[] args) {
	 ArrayListStack st=new ArrayListStack();
	 st.push(1);
	 st.push(2);
	 st.push(3);
	 st.push(4);
	 st.push(5);
	 st.push(6);
	 st.pop();
	 System.out.println(st.peek());
	 while(!st.isEmpty())System.out.println(st.pop());
	 System.out.println(st.isEmpty());
//	 System.out.println(st.peek());
}
}
