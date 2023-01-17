package Tutorials.T4;
import java.util.Scanner;
import static java.lang.System.out;

public class Tester {

    public static void main(String[] args) {

        java.util.Scanner input = new Scanner(System.in);

        Point p1 = new Point(1,2);
        Point p2 = new Point(5,3);
        Circle c1 = new Circle( 3, p1);
        Circle c2 = new Circle(2, p2);
        Cylinder cy1 = new Cylinder(3,p1 , 5);

        out.println(cy1);

//        System.out.println(c1.getArea());
//        System.out.println(c2.getCircumference());
//        System.out.println("Distance between 2 circles: "+ c1.distance(c2));
//        System.out.println("Distance between (1,2) and (5,3): "+p1.distance(5,3));




//        Line l1 = new Line(p1,p2);
//
//        System.out.println(l1);
//        System.out.println("Line length: "+ l1.getStart().distance(l1.getEnd()));
//        System.out.println("Line length: "+ p1.distance(p2));
//        System.out.println("Line length: "+ l1.start.distance(l1.end));

//        System.out.println(p1);
//        System.out.println("Distance between (1,1) and (5,3): "+p1.distance(5,3));
//        System.out.println("Distance between (1,1) and (5,3): "+p1.distance(p2));
//        System.out.println("Distance between (1,1) and (5,3): "+p1.distance());
    }
}
