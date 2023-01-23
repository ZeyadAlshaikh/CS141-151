public class Tetrahedron extends ThreeDimensionalShape
{
	 private double a;

    public Tetrahedron(Point position, String color, double a) {
        super(position, color);
		  this.a = a;
    }
    
	@Override
	public double getArea()
	{
		return Math.sqrt(3) * a * a;
	}
   
	@Override
	public double getVolume()
	{
		return Math.pow(a,2) / 6 * Math.sqrt(a) ;
	}
   
	 @Override
    public String toString() {
        return  String.format("Tetrahedron[%s, a=%.2f]", super.toString(), a);
    }
}
