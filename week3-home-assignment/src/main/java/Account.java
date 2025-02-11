public class Account {
    private double currentBalance;

    public Account() {
        this.currentBalance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.currentBalance += amount;
        } else {
            System.out.println("Amount must be greater than 0");
        }
    }

    public double withdraw(double amount) {
        if (amount > 0 && amount <= this.currentBalance) {
            this.currentBalance -= amount;
            return amount;
        } else if (amount > this.currentBalance) {
            System.out.println("Insufficient funds");
        } else {
            System.out.println("Amount must be greater than 0");
        }
        return 0.0;
    }

    public double getCurrentBalance() {
        return this.currentBalance;
    }
}
