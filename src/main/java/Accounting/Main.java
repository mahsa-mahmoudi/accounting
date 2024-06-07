package Accounting;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();

        double totalDebt = AccountingOperations.calculateTotalDebt(10000, 0.05, 5);
        double monthlyPayment = AccountingOperations.calculateMonthlyPayment(10000, 0.05, 5);
        double interest = bankAccount.calculateInterest(10000, 0.05, 5);

        System.out.println("Total Debt:  "+ String.format ("%.2f",totalDebt));
        System.out.println("Monthly Payment: " + String.format( "%.3f", monthlyPayment));
        System.out.println("Interest: " + interest);
    }
}
