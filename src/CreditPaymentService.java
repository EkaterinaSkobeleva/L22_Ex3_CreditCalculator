public class CreditPaymentService {
    public double calculate(long creditSum, double creditRate, int period) {
        double i = creditRate / 12; //процентная ставка по займу в месяц
        //System.out.println(i);
        //https://moezhile.ru/kreditovanie/raschet-annuiteta.html
        //формула рассчета аннуитетного платежа
        double creditPaymentForMonth = creditSum * ((i * Math.pow(1 + i, period)) / (Math.pow(1 + i, period) - 1));
        return creditPaymentForMonth;
    }
}
