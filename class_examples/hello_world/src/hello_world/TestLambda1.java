package hello_world;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student6 {

	int id;
	String name;
	String ColgName = "IITD";

	Student6(int id, String name) {
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

		if (obj instanceof Student6 && ((Student6) obj).id == this.id) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return this.id * 5;
	}

}

/*
 * class StudentComparator implements Comparator<Student5>{
 * 
 * @Override public int compare(Student5 o1, Student5 o2) { return
 * o1.name.compareTo(o2.name); }
 * 
 * }
 */

public class TestLambda1 {

	public static void main(String[] args) {
		Student6 st3 = new Student6(101, "Suraj");
		Student6 st4 = new Student6(103, "John");
		Student6 st5 = new Student6(102, "Raj");
		
		List<Student6> mylist = new ArrayList<Student6>();
		
		mylist.add(st3);
		mylist.add(st4);
		mylist.add(st5);
		mylist.add(st5);
		
		System.out.println(mylist);
		
		//Collections.sort(mylist);
		//Collections.sort(mylist, new StudentComparator());
		
		/*
		 * Collections.sort(mylist, new Comparator<Student6>() {
		 * 
		 * @Override public int compare(Student6 o1, Student6 o2) { return
		 * o1.name.compareTo(o2.name); }
		 * 
		 * });
		 */
		
		//Collections.sort(mylist,
				//() -> {};
		
		Collections.sort(mylist,
				(Student6 o1, Student6 o2) -> {return o1.name.compareTo(o2.name);});
				
		System.out.println(mylist);

		

	}

}