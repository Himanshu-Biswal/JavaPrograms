package Pratice;

class W{
	static W w;
	private W() {}
	
	public static W getInst() {
		if(w==null) {
			w=new W();
			return w;
		}
		 return w;
	}
	}




public class Java {	
 public static void main(String[] args) {
	W w=W.getInst();
	W x=W.getInst();
	
	System.out.println(w+"\n"+x);

}
}
