public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();
        long creditSum = 1_000_000;
        double creditRate = 0.0999;

        int periodForOneYear = 12;
        long monthPaymentOneYear = Math.round(service.calculate(creditSum, creditRate, periodForOneYear));
        System.out.println(monthPaymentOneYear);

        int periodForTwoYear = 24;
        long monthPaymentTwoYear = Math.round(service.calculate(creditSum, creditRate, periodForTwoYear));
        System.out.println(monthPaymentTwoYear);

        int periodForThreeYear = 36;
        long monthPaymentThreeYear = Math.round(service.calculate(creditSum, creditRate, periodForThreeYear));
        System.out.println(monthPaymentThreeYear);
    }
}
