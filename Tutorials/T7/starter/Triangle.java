public final class Triangle extends TwoDimensionalShape
{
    private double sideA;
    private double sideC;
    private double base;
    private double height;

    public Triangle(Point position, String color, double height, double base, double sideA, double sideC) {
        super(position, color);
        this.height = height;
        this.base = base;
        this.sideA = sideA;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
    
    @Override
    public double getPerimeter() {
        return sideA + base + sideC;
    }
    
    @Override
    public String toString() {
        return  String.format("Triangle[base=%f, height=%f, sideA=%f, sideC=%f, %s]", 
                base, height, sideA, sideC, super.toString());
    }
    
    @Override
    public void resize(int percent){
        this.sideA *= (double) percent/100; 
        this.sideC *= (double) percent/100; 
        this.base *= (double) percent/100; 
        this.height *= (double) percent/100; 
    }
}
