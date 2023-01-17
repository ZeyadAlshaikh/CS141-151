package Polymorephism;

import java.io.Serializable;

public abstract class Employee implements Payable{

    private final String firstName, lastName , socialSecurityNumber;

    public Employee(String firstName, String lastName, String sSN) {
        this.firstName = firstName;
        this.lastName = lastName;
        socialSecurityNumber = sSN;
    }

    @Override
    public String toString() {
        return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", SSN=" + socialSecurityNumber + "]";
    }
     



    public final String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    public abstract double earning();


    
    
}
