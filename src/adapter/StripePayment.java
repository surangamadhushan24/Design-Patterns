package adapter;

class StripePayment {

    public void makeStripePayment(double amount) {
        System.out.println("Payment of $" + amount + " processed using Stripe.");
    }
}