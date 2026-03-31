import java.util.Date;

public class Account {
    private String accNumber;
    private double balance;
    private Date dateCreated;

    // no-arg constructor
    public Account(){
        dateCreated = new Date();
    }

    public Account(String accNumber, double balance){
        this.accNumber = accNumber;
        this.balance = balance;
        dateCreated = new Date();
    }

    public String getAccNumber(){
        return accNumber;
    }

    public double getBalance(){
        return balance;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    //methods
    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if (amount > balance){
            return false;
        }else{
            balance -= amount;
            return true;
        }
    }

    public String toString(){
        return String.format("Account number: %s\nBalance: RM%.2f\nDate Created: %s",
                                    accNumber, balance, dateCreated);
    }

    public boolean equals(Object 0){
        Acccount otherAcc = (Account) 0;
        if (this.accNumber == otherAcc.accNumber){
            return true;
        }else{
            return false;
        }
    }
}