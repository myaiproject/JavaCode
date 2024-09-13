package Encapsulation100code.basic2Intermediate;

public class Account {
    private String accountNumber;
    private double balance;

    public  Account(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance ;

    }

    // Method to deposit money
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
        else {
            System.out.println("Invalid deposit amount:");
        }

    }

    // Method to withdraw money
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
        else {
            System.out.println("Invalid withdrawal amount");
        }

    }

    // Getter for balance (read-only)


    public double getBalance() {
        return balance;
    }
}

class Main3{
    public static void main(String[] args) {
        Account account = new Account("123456", 1000.00);
        account.deposit(200.00);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(150);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(2000);//Invalid withdrawal amount
    }

}