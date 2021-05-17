package hello_world;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student4 implements Comparable<Student4>{

	int id;
	String name;
	String ColgName = "IITD";

	Student4(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void myIntro() {
		System.out.println("hi this is " + this.name + " my id is " + this.id + " college is " + this.ColgName);
	}

	public String toString() {
		return this.name;
	}

	public boolean equals(Object obj) {

		if (obj instanceof Student3 && ((Student3) obj).id == this.id) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.id * 5;
	}

	@Override
	public int compareTo(Student4 o) {
		return this.name.compareTo(o.name);
	}
}

public class TestCompare {

	public static void main(String[] args) {
		Student4 st3 = new Student4(101, "Suraj");
		Student4 st4 = new Student4(103, "John");
		Student4 st5 = new Student4(102, "Raj");
		
		List<Student4> mylist = new ArrayList<Student4>();
		
		mylist.add(st3);
		mylist.add(st4);
		mylist.add(st5);
		mylist.add(st5);
		
		System.out.println(mylist);
		
		Collections.sort(mylist);
		
		System.out.println(mylist);

		

	}

}
