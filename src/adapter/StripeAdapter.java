package adapter;

class StripeAdapter implements PaymentProcessor {

    private StripePayment stripePayment;

    public StripeAdapter(StripePayment stripePayment) {
        this.stripePayment = stripePayment;
    }

    @Override
    public void pay(double amount) {
        stripePayment.makeStripePayment(amount);
    }
}