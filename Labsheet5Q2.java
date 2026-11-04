public class Labsheet5Q2 {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount. Must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal. Amount exceeds current balance or is invalid.");
        }
    }

    public static void main(String[] args) {
        Labsheet5Q2 account = new Labsheet5Q2();
        account.setAccountNumber("ACC123");
        account.setAccountHolder("Bob");
        account.setBalance(5000.0);
        
        account.deposit(1500.0);
        account.deposit(-200.0);
        account.withdraw(2000.0);
        account.withdraw(6000.0);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
