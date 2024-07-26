public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Kamal", "Perera", "Joint Account", 87673542, 44, "Vavuniya");
        bankAccount.display();
        bankAccount.findRate();

        System.out.println("------------------------------------");
        SavingsAccount savingsAccount = new SavingsAccount("Kasun", "De Soyza", "Savings Account", 978394758, 50, 1000.0, "Vavuniya");
        savingsAccount.display();

        System.out.println("\n");
        // Simulate deposit and withdrawal
        savingsAccount.deposit(200);
        savingsAccount.withdraw(100);
        System.out.println("Your interest is: " + savingsAccount.applyInterest());

        CurrentAccount currentAccount = new CurrentAccount(150000);
        System.out.println("Your interest is: " + currentAccount.applyInterest());
    }
}
