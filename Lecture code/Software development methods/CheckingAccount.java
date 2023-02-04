public class CheckingAccount {

    private final int number; 
    private double balance; 

    public CheckingAccount(int number) { 
        this.number = number; 
    }
    public void deposit(double amount) { 
        balance += amount; 
    }
    protected void withdraw(double amount) throws InsufficientFundsException { 
        if (amount <= balance) { 
            balance -=amount; 
        } else { 
            double needs = amount - balance; 
            throw new InsufficientFundsException(needs); 
        }
    }
    public double getBalance() {
         return balance; 
    }
    public int getNumber() { 
        return number; 
    }

    
}
