package P6;

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
}
