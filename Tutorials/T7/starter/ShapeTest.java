
import static java.lang.System.out;

public class ShapeTest
{
    public static void main(String[] args) {
        Shape shape1;

        TwoDimensionalShape shape2;
        
        shape2 = new Circle(new Point(2.5, 1.75), "red", 5.0);
        shape1 =  shape2;
        out.printf("Shape 3: \n\t-%s\n\t-%.2f\n\t-%.2f", shape1, shape1.getArea(),
                shape2.getPerimeter());
        out.println();

        shape2 = new Triangle(new Point(6.5, 6.75), "blue", 4.0, 8.0, 5.6, 5.6);
        shape1 =  shape2;
        out.printf("Shape 4: \n\t-%s\n\t-%.2f\n\t-%.2f", shape1, shape1.getArea(),
                shape2.getPerimeter());
        out.println();
        
        shape2 = new Rectangle(new Point(4.55, 3.73), "orange", 9.6, 3.2);
        out.printf("Shape 5: \n\t-%s\n\t-%.2f\n\t-%.2f", shape2, shape2.getArea(),
                shape2.getPerimeter());
        out.println();

        shape2 = new Square(new Point(23.25, 56.35), "green", 7.4);
        shape1 =  shape2;
        out.printf("Shape 6: \n\t-%s\n\t-%.2f\n\t-%.2f", shape1, shape1.getArea(),
                shape2.getPerimeter());
        out.println();

    }
}
