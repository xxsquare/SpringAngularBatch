package assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class weekDay implements Comparable<weekDay> {
    int id;
    String day;

    weekDay(int id, String day) {
        this.id = id;
        this.day = day;
    }
    @Override
    public String toString(){
        return "id=" + id + ",day=" + day ;
    }
    @Override
    public int compareTo(weekDay o) {
        return this.id - o.id;
    }
}

//class StudentComparator implements Comparator<Student5>{
//
//    @Override
//    public int compare(Student5 o1, Student5 o2)
//    {    int x = o1.id;
//         int y = o2.id;
//
//        return (x<y) && o1.name.compareTo(o2.name);
//    }
//
//}


public  class weekDaySort  {

    public static void main(String args[]){
        weekDay day1 = new weekDay(7,"Sunday");
        weekDay day2 = new weekDay(2,"Tuesday");
        weekDay day3 = new weekDay(4,"Thursday");
        weekDay day4 = new weekDay(3,"Wednesday");
        weekDay day5 = new weekDay(5,"Friday");
        weekDay day6 = new weekDay(6,"Saturday");
        weekDay day7 = new weekDay(1,"Monday");

        List<weekDay> mylist= new ArrayList<weekDay>();
        mylist.add(day1);
        mylist.add(day2);
        mylist.add(day3);mylist.add(day4);mylist.add(day5);
        mylist.add(day6);mylist.add(day7);
//        mylist.add("Sunday");
//        mylist.add("Thursday");mylist.add("Wednesday");
//        mylist.add("Tuesday");mylist.add("Friday");
//        mylist.add("Saturday");mylist.add("Monday");


        System.out.println(mylist);

          Collections.sort(mylist);
//        Collections.sort(mylist, new StudentComparator());


        System.out.println(mylist);


    }
}
