package Polymorephism;

public class Tester {
    public static void main(String[] args) {
//        Employee[] employees = {
//                new SalariedEmployee("Ali", "Mohammad", "09876", 1500),
//                new CommissionEmployee("Khaled", "Ibrahem", "098765", 10000, 0.05),
//                new BasePlusCommissionEmployee("Zeyad", "Abdullah", "789798",7000,0.3,300)
//        };
//
//        for(Employee current: employees){
//            System.out.println(current.getClass().getName());
//            // check if the employee is a BasePlusCommission Employee
//            if( current instanceof BasePlusCommissionEmployee ){
//                ((BasePlusCommissionEmployee) current).setBaseSalary(1.10 * ((BasePlusCommissionEmployee) current).getBaseSalary());
//                //or
//                BasePlusCommissionEmployee temp = (BasePlusCommissionEmployee) current;
//                temp.setBaseSalary(1.10 * temp.getBaseSalary());
//            }
//            System.out.println(current);
//            System.out.println(current.earning());
//        }

        Payable[] payables = {
                new Invoice("908098","tire",2,375.02),
                new Invoice("5345345", "seat", 4, 79),
                new SalariedEmployee("Ali", "Mohammad", "09876", 1500),
                new CommissionEmployee("Khaled", "Ibrahem", "098765", 10000, 0.05),
                new BasePlusCommissionEmployee("Zeyad", "Abdullah", "789798",7000,0.3,300)
        };

        for(Payable current: payables){
            System.out.println(current.getClass().getSimpleName());
            System.out.println(current);
            System.out.println(current.getPaymentAmount());
        }



       
    }
}
