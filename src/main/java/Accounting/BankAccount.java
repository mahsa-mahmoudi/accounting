package Accounting;

public class BankAccount implements AccountingOperations {

    @Override
    public double calculateInterest(double principal, double interestRate, int years) {
        // محاسبه سود به صورت دستی
        return principal * interestRate * years;
    }
}
