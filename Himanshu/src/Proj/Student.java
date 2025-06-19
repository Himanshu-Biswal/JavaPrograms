package Proj;
public class Student {	
	String Sname;
	int age;
	 Qualification q;
	
  Student(String Sname,int age,Qualification q){
	 this.Sname=Sname;
	 this.age=age;
	 this.q=q;
  }
  public void displayDetails(int n) {
	  
	  System.out.println("Student Name: "+Sname+"\n"+ "Age: "+age);
//	  q.dispalyQualification();

  
  	  switch(n) {
  	  case 1->q.MCA();
  	  case 2->q.Bsc();
  	  case 3->q.PlusTwo();
  	  case 4->q.TenTh();
  	  default-> {
  		System.out.println("Enter valid Qualification");
  		
  	  } 
  	  }

  }
  
  
}
