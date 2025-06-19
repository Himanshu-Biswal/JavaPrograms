package Pratice;

class Enc{
	private int age;
	private String name;
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}
public class Exam {
    public static void main(String[] args) {
      Enc e = new Enc();
      e.setAge(25);
      e.setName("Himanshu");
      System.out.println(e.getName()+":"+e.getAge());
    }
}

