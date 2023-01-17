package Polymorephism;

public class Tester {
    public static void main(String[] args) {
       Payable[] payables = {
        new BasePlusCommissionEmployee("Zeyad", "Abdullah", "789798",7000,0.3,300),       
        new SalariedEmployee("Ali", "Mohammad", "09876", 1500),
        new CommissionEmployee("Khaled", "Ibrahem", "098765", 10000, 0.05),
               new Invoice("979879898", "Water", 5, 1),
               new Invoice("879798", "PC", 1, 3000)
       };


       for(int i=0; i< payables.length ; i++){
           System.out.println(payables[i].getClass().getSimpleName());
           System.out.println(payables[i]);
           System.out.println(payables[i].getAmount());

       }

//       for(int i=0; i< employees.length; i++){
//           System.out.println(employees[i].getClass().getSimpleName());
//           System.out.println(employees[i]);
//
//           if(employees[i] instanceof  BasePlusCommissionEmployee){
//               BasePlusCommissionEmployee temp = (BasePlusCommissionEmployee) employees[i];
//               double oldSalary = temp.getBaseSalary();
//               temp.setBaseSalary(1.10 * oldSalary);
//               System.out.println("After raise");
//               System.out.println(employees[i]);
//               //or
//               //((BasePlusCommissionEmployee)employees[i]).setBaseSalary(1.10 * ((BasePlusCommissionEmployee)employees[i]).getBaseSalary());
//
//           }

 //      }

      
        


       



/*

       for(Employee current: employees){
           System.out.println(current.getClass().getName());
           // check if the employee is a BasePlusCommission Employee
           if( current instanceof BasePlusCommissionEmployee ){
              // ((BasePlusCommissionEmployee) current).setBaseSalary(1.10 * ((BasePlusCommissionEmployee) current).getBaseSalary());
               //or
               System.out.println("Before raise");
               System.out.println(current);
               BasePlusCommissionEmployee temp = (BasePlusCommissionEmployee) current;
               temp.setBaseSalary(1.10 * temp.getBaseSalary());
           }
           System.out.println(current);
           System.out.println(current.earning());
       }
*/
        // Payable[] payables = {
        //         new Invoice("908098","tire",2,375.02),
        //         new Invoice("5345345", "seat", 4, 79),
        //         new SalariedEmployee("Ali", "Mohammad", "09876", 1500),
        //         new CommissionEmployee("Khaled", "Ibrahem", "098765", 10000, 0.05),
        //         new BasePlusCommissionEmployee("Zeyad", "Abdullah", "789798",7000,0.3,300)
        // };

        // for(Payable current: payables){
        //     System.out.println(current.getClass().getSimpleName());
        //     System.out.println(current);
        //     System.out.println(current.getPaymentAmount());
        // }



       
    }
}
