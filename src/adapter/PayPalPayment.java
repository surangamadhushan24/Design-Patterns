package adapter;

class PayPalPayment implements PaymentProcessor {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of $" + amount + " processed using PayPal.");
    }
}
