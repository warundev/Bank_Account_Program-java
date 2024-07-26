class BankAccount {
    private String firstName;
    private String lastName;
    private String accountType;
    private int accountNo;
    private double minBalance = 500.0;
    private String branch;
    private double rate;

    public BankAccount() {
        this.firstName = null;
        this.lastName = null;
        this.accountType = null;
        this.accountNo = 0;
        this.rate = 0.0;
        this.branch = null;
    }

    public BankAccount(String firstName, String lastName, String accountType, int accountNo, double rate, String branch) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountType = accountType;
        this.accountNo = accountNo;
        this.rate = rate;
        this.branch = branch;
    }

    // Getters and Setters

    public void findRate() {
        if (rate >= 75) {
            System.out.println("Rate is Excellent");
        } else if (rate >= 50) {
            System.out.println("Rate is Good");
        } else {
            System.out.println("Rate is Normal");
        }
    }

    public void display() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Account No: " + accountNo);
        System.out.println("Branch: " + branch);
        System.out.println("Minimum Balance: " + minBalance);
    }
}
