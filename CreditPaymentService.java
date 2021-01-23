public class CreditPaymentService {

    public double calculate(double creditAmount, double creditPercentPerYear, int yearNum) {
        if(creditAmount < 0 || creditPercentPerYear < 0 || yearNum < 0 || yearNum > 3) {
            creditAmount = 0;
        }

        int monthNum = yearNum * 12;
        double creditPercentPerMonth = creditPercentPerYear / 12 / 100;
        double creditPercentPerMonth1 = 1 + creditPercentPerMonth;
        double intoBrackets = Math.pow(creditPercentPerMonth1, monthNum);
        double upperPart = creditPercentPerMonth * intoBrackets;
        double bottomPart = intoBrackets - 1;
        return creditAmount * upperPart / bottomPart;
    }
}
