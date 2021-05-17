package hello_world;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student5 {

	int id;
	String name;
	String ColgName = "IITD";

	Student5(int id, String name) {
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

}

class StudentComparator implements Comparator<Student5>{

	@Override
	public int compare(Student5 o1, Student5 o2) {
		return o1.name.compareTo(o2.name);
	}
	
}

public class TestComparator {

	public static void main(String[] args) {
		Student5 st3 = new Student5(101, "Suraj");
		Student5 st4 = new Student5(103, "John");
		Student5 st5 = new Student5(102, "Raj");
		
		List<Student5> mylist = new ArrayList<Student5>();
		
		mylist.add(st3);
		mylist.add(st4);
		mylist.add(st5);
		mylist.add(st5);
		
		System.out.println(mylist);
		
		//Collections.sort(mylist);
		Collections.sort(mylist, new StudentComparator());
		
		System.out.println(mylist);

		

	}

}