class SavingsAccount extends BankAccount {
    private double balance;
    private double interest;
    private final String accountName = "Singithi";

    public SavingsAccount(String firstName, String lastName, String accountType, int accountNo, double rate, double balance, String branch) {
        super(firstName, lastName, accountType, accountNo, rate, branch);
        this.balance = balance;
    }

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double depositAmount) {
        if (depositAmount < 0) {
            System.out.println("Invalid amount");
        } else {
            balance += depositAmount;
            System.out.println("Your balance after deposit: " + balance);
        }
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount < 0) {
            System.out.println("Invalid amount");
        } else if (balance < withdrawalAmount) {
            System.out.println("Not sufficient balance");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Your balance after withdrawal: " + balance);
        }
    }

    public double applyInterest() {
        if (balance >= 10000) {
            interest = balance * 0.1;
        } else {
            interest = 1000 + (balance * 0.2);
        }
        return interest;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Account Name: " + accountName);
        System.out.println("Current Balance: " + balance);
    }
}
