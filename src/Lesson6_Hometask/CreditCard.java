package Lesson6_Hometask;

public class CreditCard {
    String accountNumber;
    double currentAmount;

    public CreditCard (String an, double ca) {
        accountNumber = an;
        currentAmount = ca;
    }

    public String sayHelloFromNewClass(){
        return "Hello from New Class 1";
    }

    public double sum(double amount) {
        return currentAmount += amount;
    }

    public double diff(double amount) {
        return currentAmount -= amount;
    }

    public void print() {
        System.out.println("Current amount: " + currentAmount + " of account number " + accountNumber);
    }
}
