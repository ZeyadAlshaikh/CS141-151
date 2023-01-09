package Polymorephism;

public class HourlyEmployee extends  Employee{

    private double wage, hours;

    public HourlyEmployee(String firstName, String lastName, String sSN, double wage, double hours) {
        super(firstName, lastName, sSN);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() +" HourlyEmployee{" +
                "wage=" + wage +
                ", hours=" + hours +
                '}';
    }

    @Override
    public double earning() {
        if( getHours() <= 40 )
            return getWage() * getHours();
        else
            return (40 * getWage())  + (getHours()-40) * getWage()*1.5  ;

    }

    @Override
    public double getPaymentAmount() {
        return earning();
    }
}
