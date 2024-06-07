package Accounting;

public interface AccountingOperations {
    static double calculateTotalDebt(double principal, double interestRate, int years) {
        return principal * Math.pow((1 + interestRate), years) - principal;
    }

    static double calculateMonthlyPayment(double principal, double interestRate, int years) {
        return calculateTotalDebt(principal, interestRate, years) / years;
    }

    double calculateInterest(double principal, double interestRate, int years);

}
