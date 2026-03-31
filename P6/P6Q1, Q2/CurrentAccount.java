public class CurrentAccount extends Account{
    //data feild / properties
    private static int freeTransactions = 3;
    private static double transactionFee = 2.00;
    private int transactionCount;

    //constructor
    public CurrentAccount(String accNumber, double balance){
        // invoke the superclass's constructor
        super(accNumber, balance);
        transactionCount = 0;
    }

    //getter
    public static double getTransactionFee() {
        return transactionFee;    
    }

    public static int getfreeTransactions(){
        return freeTransactions;
    }

    public int getTransactionCount(){
        return transactionCount;
    }

    public void incrementTransactionCount(){
        transactionCount++;
    }

    public void deductTransactionFee(){
        super.withdraw(transactionFee);
    }

    public boolean withdraw(double amount){
        super.withdraw = true;
        return successful;
    }
    

    public void deposit(double amount){
        super.deposit(amount);
        transactionCount++;
        if(transactionCount > freeTransactions){
            deductTransactionFee();
        }
    }

    public String toString(){
        return super.toString() + "\nTransaction Count: " + transactionCount;
    }
}