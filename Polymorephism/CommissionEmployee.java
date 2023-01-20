package Polymorephism;

public   class CommissionEmployee extends Employee{

    private double grossSale, rate;

    

    public CommissionEmployee(String firstName, String lastName, String sSN, double grossSale, double rate) {
        super(firstName, lastName, sSN);
        this.grossSale = grossSale;
        this.rate = rate;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setGrossSale(double grossSale) {
        this.grossSale = grossSale;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return super.toString() +  " CommissionEmployee [grossSale=" + grossSale + ", rate=" + rate + "]";
    }

    @Override
    public double earning() {
        // TODO Auto-generated method stub
        return getGrossSale() * getRate();
    }



    @Override
    public double getAmount(){
        return earning();
    }
   
   



    
    
    

   
    

    
    
}
