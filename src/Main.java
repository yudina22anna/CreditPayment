public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double creditPayment = service.calculate(9.99, 12, 1000000);
        System.out.println(creditPayment);

        double creditPayment1 = service.calculate(9.99, 24, 1000000);
        System.out.println(creditPayment1);

        double creditPayment2 = service.calculate(9.99, 36, 1000000);
        System.out.println(creditPayment2);

    }
}
