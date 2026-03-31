public class SavingsAccount extends Account{
    private static double interestRate = 0.05;

    // no-arg constructor
    public SavingsAccount(){
        // super();
    }

    public SavingsAccount(String accNumber, double balance){
        // super() automatically invoke the superclass constructor
        super(accNumber, balance);
    }

    public static double getInterestRate() {
        return interestRate;
        
    }

    public static void setInterestRAte(double interestRate){
        SavingsAccount.interestRate = interestRate;
    }

    public double calcInterest(){
        return getBalance() * interestRate / 12;
    }

    public void addInterest(){
        double interest = calcInterest();
        deposit(interest);
    }
}