package InnerClass;
interface Student{
	void studentDetails();
}
public class AnnonymousInnerClass {
 public static void main(String[] args) {
	Student s=new Student() {
	  @Override
		public void studentDetails() {
			System.out.println("Student Name: Himanshu");
		}
//	   static void m1() {
//		  System.out.println("Annonymous Inner Class");
//	  }
	};
	s.studentDetails();
//	s.m1();CTE
//	AnnonymousInnerClass.m1();CTE
}
}
