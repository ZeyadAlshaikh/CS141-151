
import static java.lang.System.out;

public class DrawingTest
{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];

        shapes[2] = new Circle(new Point(2.5, 1.75), "red", 5.0);
        shapes[3] = new Triangle(new Point(6.5, 6.75), "blue", 4.0, 8.0, 5.6, 5.6);
        
        Drawing drawing = new Drawing(shapes);
          
        int i = 1;
        for(Shape s: drawing.getShapes()) {
            if (s != null) {
					TwoDimensionalShape tds = (TwoDimensionalShape) s;
					System.out.printf("Shape %d: \n\t-%s\n\t-%.2f\n\t-%.2f\n", i, s, s.getArea(),  tds.getPerimeter());
				}
            i++;
        }
        
        drawing.updateShape(new Rectangle(new Point(4.55, 3.73), "orange", 9.6, 3.2), 0);
        drawing.updateShape(new Square(new Point(23.25, 56.35), "green", 7.4), 1);
        
        Shape shape1 = drawing.shapeAt(0);
        Shape shape2 = drawing.shapeAt(1);
        
        out.printf("Shape %d: \n\t-%s\n\t-%.2f\n", i++, shape1, shape1.getArea());
        out.printf("Shape %d: \n\t-%s\n\t-%.2f\n", i, shape2, shape2.getArea());
       
    }
}
