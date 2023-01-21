import java.util.Scanner;

import static java.lang.System.out;

public class Tester {

    public static void main(String[] args) {
        Point p = new Point(0,0);
        Shape s = new Shape("Red", p);
        System.out.println(s);
        System.out.println(s.getArea());

        Shape td = new TwoDimensionalShape("Green", new Point(1,1));
        System.out.println(td);
        System.out.println(td.getArea());
        System.out.println(((TwoDimensionalShape)td).getPerimeter());

        TwoDimensionalShape rect  = new Rectangle("Green", new Point(1,1), 10,7);
        System.out.println(rect);
        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());


        Shape cir  = new Circle("Green", new Point(1,1), 5);
        System.out.println(cir);
        System.out.println(cir.getArea());
        System.out.println(((TwoDimensionalShape)cir).getPerimeter());




        

    }
}
