package hello_world;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Card{
	int crn;
	
	Card(int crn){
		this.crn = crn;
	}
	
	public String toString() { 
		return String.valueOf(this.crn); 
	}
	
}

public class TestCollections {

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
		
		Set<Student4> myset = new HashSet<Student4>();
		
		myset.add(st3);
		myset.add(st4);
		myset.add(st5);
		myset.add(st5);
		
		System.out.println(myset);
		
		Card c1 = new Card(22);
		Card c2 = new Card(33);
		Card c3 = new Card(44);
		
		Map<Card,Student4> mybanking = new HashMap<Card,Student4>();
				
		mybanking.put(c1, st3);
		mybanking.put(c2, st4);
		mybanking.put(c3, st5);
		
		System.out.println(mybanking);
		
				
	}

}
