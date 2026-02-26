public class PayPalPayment extends BasePayment {
    public void accepted(){
        System.out.println("Payment method is accepted: " + getClass().getSimpleName());
    }
}
