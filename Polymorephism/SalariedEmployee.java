package Polymorephism;

public class SalariedEmployee extends Employee{
    private double salary ;

    public SalariedEmployee(String firstName, String lastName, String sSN, double salary) {
        super(firstName, lastName, sSN);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double earning() {
        // TODO Auto-generated method stub
        return getSalary();
    }

    @Override
    public double getPaymentAmount() {
        return earning();
    }

//    @Override
    // YOU CAN NOT OVERRIDE FINAL METHODS
//    public final String getFirstName() {
//        return "firstName";
//    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Salary: "+ getSalary();
    }


    
    
    
    

}
