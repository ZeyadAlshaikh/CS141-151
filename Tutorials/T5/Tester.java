package Tutorials.T5;

import Tutorials.T4.Cylinder;

import java.util.Scanner;

import static java.lang.System.out;

public class Tester {

    public static void main(String[] args) {




        Shape s1 = new Shape();
        //out.println(s1 + "Area: "+ s1.getArea());

        Shape td= new TwoDimensionalShape();
       // out.println(td + " Area:"+ td.getArea() + "Perimeter "+((TwoDimensionalShape) td).getPerimeter());




        TwoDimensionalShape r1 = new Rectangle(4,5);
//        out.println(r1 + " Area: "+r1.getArea());
//        out.println(r1.getPerimeter());

        Shape c = new Circle(5,new Point(2,5));
//        out.println(c + " Area: "+ c.getArea());
//        out.println(((TwoDimensionalShape)c).getPerimeter());

        Shape s = new Square(6);
//        out.println(s + " Area: "+ s.getArea());
//        out.println(((TwoDimensionalShape)s).getPerimeter());

        Shape t = new Triangle(2,3,4,5);
//        out.println(t + " Area: "+ t.getArea());
//        out.println(((TwoDimensionalShape)t).getPerimeter());


        //ex.4

        Shape shaps[] = new Shape[4];
        shaps[0] = s1;
        shaps[1] = td;
        shaps[2] = c;
        shaps[3] = t;

        Drawing d = new Drawing(shaps);


        for(Shape curr: d.getShaps())
        {
            out.println(curr);
            out.println("Area: "+curr.getArea());
            if(curr instanceof TwoDimensionalShape)
            out.println("Perimeter: "+((TwoDimensionalShape)curr).getPerimeter());
        }

        d.updateShape(0, r1);
        d.updateShape(1,s);


        out.println("New objects");
        out.println(d.shapeAt(0));
        out.println(d.shapeAt(1));





    }
}
