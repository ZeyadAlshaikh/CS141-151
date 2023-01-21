import java.util.Scanner;

import static java.lang.System.out;

public class Tester {

    public static void main(String[] args) {

    //    Shape s = new Shape("Red", new Point(3,2)); 

    //    System.out.println(s);
    //    System.out.println(s.getArea());

    //    Shape dts = new TwoDimensionalShape("Green", new Point(0,2));
        
    //    System.out.println(dts);
    //    System.out.println(dts.getArea());
    //    System.out.println(((TwoDimensionalShape)dts).getPerimeter());

       TwoDimensionalShape rt =  new Rectangle("Yellow", new Point(5,5), 4,7);
       System.out.println(rt);
       System.out.println(rt.getArea());
       System.out.println(rt.getPerimeter());


        Shape  c = new Circle("Black", new Point(0,0), 7);
        Shape  sq = new Square("Red", new Point(0,0), 10,10);
        Shape tr = new Triangle("Green", new Point(0,0), 4,6,6,7);
        
        System.out.println(c);
        System.out.println(c.getArea());
        System.out.println(((TwoDimensionalShape)c).getPerimeter());

        

    }
}
