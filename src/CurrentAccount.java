class CurrentAccount extends SavingsAccount {
    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public double applyInterest() {
        double interest;
        double balance = getBalance();  // Assume a method to get balance
        if (balance <= 10000) {
            interest = balance * 0.5;
        } else {
            interest = balance * 0.9;
        }
        return interest;
    }

    private double getBalance() {
        // Assume this method exists to return the balance
        return 0;
    }
}
