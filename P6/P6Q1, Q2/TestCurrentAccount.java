import java.util.Scanner;

public class TestCurrentAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CurrentAccount C1 = new CurrentAccount("12345", 10000.00);

        int selection = 4;
        do{
            System.out.println("\n1. Withdrawal");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.print("4. Quit");
            selection = input.nextInt();

            switch(selection){
                case 1:
                    System.out.println("\nWITHDRAWAL");
                    System.out.println("-".repeat(30));
                    System.out.printf("Current balance: RM%,.2f\n", C1.getBalance());
                    System.out.println("Enter amount: RM ");
                    double amount = input.nextDouble();
                    if(C1.withdraw(amount)){
                    // omcrease transaction count by 1
                    C1.incrementTransactionCount();
                    if(C1.getTransactionCount() > CurrentAccount.getfreeTransactions()){
                        C1.deductTransactionFee();
                    }
                    System.out.printf("Updated balance: RM%.2f", C1.getBalance());
                }else{
                System.out.println("Transaction failed: Insufficient balance");
                }
                break;
            case 2:
                System.out.println("\nDeposit");
                System.out.println("-".repeat(30));
                System.out.printf("Current balance: RM%,.2f\n", C1.getBalance());
                System.out.println("Enter amount: RM ");
                amount = input.nextDouble();
                C1.deposit(amount);
                if(C1.getTransactionCount() > CurrentAccount.getfreeTransactions()){
                    C1.deductTransactionFee();
                }
                System.out.printf("Upadated balance: RM%,.2f\n", C1.getBalance());
                break;

            case 3:
                System.out.printf("Current balance: RM%,.2f\n", C1.getBalance());
                break;
            case 4:
                System.out.println("\n\nTerminating program...");

            } 
        } while(selection >= 1 && selection <= 3);
        
    }
}
