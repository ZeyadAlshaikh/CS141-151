public class Complex {
    private double re, im; 

    public Complex( double a, double b){
        re = a ; 
        im = b; 
    }

    public Complex( Complex c){
        this( c.re, c.im);
    }

    public String toString(){
        return "( "+ re + " + "+ im + " )";
    }


    public static void main(String[] args) {
        Complex c1 = new Complex(3.5, 1.2);
        System.out.println(c1);

        Complex c2 = new Complex(c1);
        System.out.println(c2);
    }



}
