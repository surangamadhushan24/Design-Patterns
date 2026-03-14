package adapter;

public class Main {

    public static void main(String[] args) {

        // PayPal payment
        PaymentProcessor paypal = new PayPalPayment();
        PaymentService service1 = new PaymentService(paypal);
        service1.processPayment(100);


        // Stripe payment using Adapter
        StripePayment stripe = new StripePayment();
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);

        PaymentService service2 = new PaymentService(stripeAdapter);
        service2.processPayment(200);
    }
}
