package Polymorephism;

import Polymorephism.CommissionEmployee;

public class BasePlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String sSN, double grossSale, double rate, double baseSalary) {
        super(firstName, lastName, sSN, grossSale, rate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

@Override
    public String toString() {
        return super.toString() +"BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }


    @Override
    public double earning() {
        return super.earning() + getBaseSalary();
    }


    @Override
    public double getAmount(){
        return earning();
    }
   
public void specialMethod(){
    System.out.println("I'm special");
}



}