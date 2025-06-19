package Aa_Interview_Question;
 
interface I{
	public int add(int i,int j);
}
public class Q_04_LambadaExpressionFor_Addition {
 public static void main(String[] args) {
	I i=(a,b)->{return a+b;};
	System.out.println(i.add(4, 3));
}
}
