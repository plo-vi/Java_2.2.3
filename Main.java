public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double OneYear = service.calculate(1000000, 9.99, 1);
        System.out.printf("%.0f", OneYear);
        System.out.println ();

        double TwoYears = service.calculate(1000000, 9.99, 2);
        System.out.printf("%.0f", TwoYears);
        System.out.println ();

        double ThreeYears = service.calculate(1000000, 9.99, 3);
        System.out.printf("%.0f", ThreeYears);
        System.out.println ();
    }
}
