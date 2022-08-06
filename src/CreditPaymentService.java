public class CreditPaymentService {
    public double calculate (double percent, int period, int amount) {
        double ratio = percent/period/100;
        double creditPayment = (ratio+(ratio/((Math.pow(1+ratio, period)-1))))*amount;
        return (int) creditPayment;
    }
}
