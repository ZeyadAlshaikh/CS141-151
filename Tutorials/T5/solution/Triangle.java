public class Triangle extends TwoDimensionalShape{

    private double sideA , base , sideC, height;

    public Triangle(String color, Point position, double sideA, double base, double sideC, double height) {
        super(color, position);
        this.sideA = sideA;
        this.base = base;
        this.sideC = sideC;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() +"\nTriangle [sideA=" + sideA + ", base=" + base + ", sideC=" + sideC + ", height=" + height + "]";
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return  (base * height)/2;
    }

    @Override
    public double getPerimeter() {
        // TODO Auto-generated method stub
        return sideA + base + sideC;
    } 

    

    
    
    
}
