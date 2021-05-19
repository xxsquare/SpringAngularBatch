package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student6 {
    int id;
    String name;

    Student6(int id , String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student6{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }

}
class StudentComparator1 implements Comparator<Student6> {

    @Override
    public int compare(Student6 o1, Student6 o2) {
         int x = o1.id ;
         int y = o2.id ;
          if (x != y)
              return x-y;
          else return (o1.name.compareTo(o2.name));
    }

}

public class Test1Comparator {


    public static void main(String args[]){
        Student6 st1 = new Student6(101,"Suraj");
        Student6 st2 = new Student6(102,"Mohan");

        Student6 st3 = new Student6(105,"Lalal ");
        Student6 st4 = new Student6(104,"Sonam ");

        List<Student6> mylist = new ArrayList<Student6>();
        mylist.add(st1);
        mylist.add(st2);
        mylist.add(st3);
        mylist.add(st4);
        Collections.sort(mylist, new StudentComparator1());

        System.out.println(mylist);

    }
}

