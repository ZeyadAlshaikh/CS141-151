package Tutorials.T5;

import Tutorials.T4.Cylinder;

import java.util.Scanner;

import static java.lang.System.out;

public class Tester {

    public static void main(String[] args) {

        Shape s1 = new Shape();
        out.println(s1 + "Area: "+ s1.getArea());

        Rectangle r1 = new Rectangle(4,5);
        out.println(r1.getArea());
        out.println(r1.getPerimeter());

    }
}
