

public class Tester2 {
    

    public static void main(String[] args) {

        System.out.println(Person.getCount());


        // Person p1 = new Person(); 
        // System.out.println(p1.toString());
        // System.out.println(p1.getCount());
        
        // Person p2 = new Person("ALi");
        // System.out.println(p2);
        // System.out.println(p1.getCount());

        Person p3 = new Person("Ahamad", 20,"1224324",  new DateOfBirth(1, 1, 2020) );
        // System.out.println(p3);
        // System.out.println(p1.getCount());
        // System.out.println(p2.getCount());
        // System.out.println(p3.getCount());

        // Person p4 = new Person(p3);
        // System.out.println(p4);

        Student st = new Student(p3, "CS");
        System.out.println(st);

        

        
    }
}
