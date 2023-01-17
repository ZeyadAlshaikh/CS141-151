package Tutorials.T4;

public class Cylinder  extends Circle{
    private double height;

    public Cylinder(double radius, Point center ,double height){
        super(radius,center);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cylinder[ " +
                super.toString()+
                " height=" + height +
                " Area="+ getArea()+
                " Volume="+ getVolume()+
                ']';
    }


    public double getArea(){
        //(𝒄∗𝒉+𝟐∗𝒃)
        return getCircumference() * height + 2 * super.getArea();
    }

    public double getVolume(){
        //(𝒃 ∗ 𝒉)
        return super.getArea() * height;
    }
}
