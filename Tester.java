import java.util.Scanner;
import java.math.*;
public class Tester{



    public static void main(String[] args) {
        // is-a
        //Polymorphism
    Student st1 = new Student("Ahmad", 23, 123232, "CS");
    UndreGraduate ust = new UndreGraduate("Ali", 20, 435534,"IS",18);
    Graduate gst = new Graduate("Muhammad", 28, 96786, "IT", "TBA");

    Object[] persons = new Person[3];
    persons[0] = new Student("Ahmad", 23, 123232, "CS");
    persons[1] = new UndreGraduate("Ali", 20, 435534,"IS",18);
    persons[2] = new Graduate("Muhammad", 28, 96786, "IT", "TBA");




//    for( int i=0 ; i< persons.length; i++){
//        System.out.println(persons[i]);
//    }
        for (Object p : persons){
            System.out.println(p);
        }



//    System.out.println(st1);
//    System.out.println(ust);
//    System.out.println(gst);



       
    }
}

