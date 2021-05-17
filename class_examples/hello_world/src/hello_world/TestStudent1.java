package hello_world;

class Student2{
	int id =101;
	String name = "Rajesh";
	
	public void myIntro() {
		System.out.println("hi this is "+ name +" my id is "+id);
	}
	
	public String toString() {
		return this.name;
	}
	
}


public class TestStudent1 {

	public static void main(String[] args) {
		Student2 st1 = new Student2();
		//System.out.println(st1);
		
		
	}

}
