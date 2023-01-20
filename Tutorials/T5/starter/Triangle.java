public class Triangle {

    private double sideA , base , sideC, height;

    public Triangle( double sideA, double base, double sideC, double height) {
        
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
        return "Triangle [sideA=" + sideA + ", base=" + base + ", sideC=" + sideC + ", height=" + height + "]";
    }

    
    public double getArea() {
        return  (base * height)/2;
    }


    public double getPerimeter() {
        return sideA + base + sideC;
    } 

    

    
    
    
}
