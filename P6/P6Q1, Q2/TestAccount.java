public class TestAccount {
    public static void main(String[] args) {
        // savings account (accNumber: 12345, bal:2000.00)
        SavingsAccount S1 = new SavingsAccount("12345", 2000.00);
            
        // current account (accNumber: 77849, bal: 1000.00)
        CurrentAccount C1 = new CurrentAccount("77849", 1000.00);

        /* Test Savings Account */
        // test 1:deposit money
        System.out.printf("Savings account %s has balance: RM%.2f\n", S1.getAccNumber(), S1.getBalance());
        System.out.println("-".repeat(50));
        System.out.println("Transaction Deposit: RM100.00");
        S1.deposit(1000.00);
        System.out.printf("Updated balance: RM%.2f\n", S1.getBalance());

        // test 2: withdraw money more than balance
        System.out.println("\nTransaction: Withdraw RM5000.00");
        boolean successful = S1.withdraw(5000.00);
        if (!successful){
            System.out.println("Trancsaction failed.Withdraw all amount > balance");
        }else{
            System.out.printf("Updated balance: RM%.2f\n", S1.getBalance());
        }

        // Test 3: withdraw RM500
        System.out.println("\nTransaction: Withdraw RM5000.00");
        boolean successful1 = S1.withdraw(5000.00);
        if (!successful1){
            System.out.println("Trancsaction failed.Withdraw all amount > balance");
        }else{
            System.out.printf("Updated balance: RM%.2f\n", S1.getBalance());
        }
        
    }


}

