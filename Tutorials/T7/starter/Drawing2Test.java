
import static java.lang.System.out;

public class Drawing2Test
{
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Sphere(new Point(2.5, 1.75), "red", 5.0);
        shapes[1] = new Tetrahedron(new Point(6.5, 6.75), "blue", 4.0);
        shapes[2] = new Circle(new Point(2.5, 1.75), "red", 5.0);
        shapes[3] = new Triangle(new Point(6.5, 6.75), "blue", 4.0, 8.0, 5.6, 5.6);
		shapes[4] = new Cube(new Point(2.5, 1.75), "red", 7.0);
        
        Drawing drawing = new Drawing(shapes);
          
        int i = 1;
        for(Shape s: drawing.getShapes()) {
				out.printf("Shape %d: \n\t-%s\n\t- area %s\n", i, s, s.getArea());
           // add your code here...

            i++;
        }
        
         
       
    }
}
