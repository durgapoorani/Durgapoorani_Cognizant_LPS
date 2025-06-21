public class PaymentTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay with credit card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.processPayment(1500.00);

        System.out.println();

        // Pay with PayPal
        context.setPaymentStrategy(new PayPalPayment("stranger@example.com"));
        context.processPayment(2500.75);
    }
}
