package hello_world;

class Student{
	int id =101;
	String name = "Rajesh";
	
	public void myIntro() {
		System.out.println("hi this is "+ name +" my id is "+id);
	}
}

class Student1{
	
	int id;
	String name;
	String ColgName = "IITD";
	
	Student1(int id,String name){
		this.id = id;
		this.name = name;
	}
	
	public void myIntro() {
		System.out.println("hi this is "+ this.name +" my id is "+ this.id +" college is "+this.ColgName);
	}
}

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.myIntro();
		
		Student st2 = new Student();
		st2.myIntro();
		
		Student1 st3 = new Student1(102,"Suraj");
		st3.myIntro();
		
		Student1 st4 = new Student1(103,"John");
		st4.myIntro();
	}

}
