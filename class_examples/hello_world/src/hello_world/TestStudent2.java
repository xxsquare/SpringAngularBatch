package hello_world;

class Student3 {

	int id;
	String name;
	String ColgName = "IITD";

	Student3(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void myIntro() {
		System.out.println("hi this is " + this.name + " my id is " + this.id + " college is " + this.ColgName);
	}

	/*
	 * public String toString() { return this.name; }
	 */

	/*
	 * public boolean equals(Student3 obj) {
	 * 
	 * if(this.id== obj.id) { return true; }else { return false; } }
	 */

	public boolean equals(Object obj) {

		if (obj instanceof Student3 && ((Student3)obj).id == this.id) {
			return true;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return this.id*5;
	}
}

public class TestStudent2 {

	public static void main(String[] args) {
		Student3 st3 = new Student3(102, "Suraj");
		// st3.myIntro();

		Student3 st4 = new Student3(103, "John");
		// st4.myIntro();

		Student3 st5 = new Student3(102, "Suraj");

		// System.out.println(st3.equals(st4));
		System.out.println(st3.equals(st5));
		
		System.out.println(st3);
		System.out.println(st5);
	}

}
