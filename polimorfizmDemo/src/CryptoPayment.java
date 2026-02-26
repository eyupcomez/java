public class CryptoPayment extends BasePayment {
    public void accepted(String message){
        System.out.println("Payment method is accepted: " + message);
    }
}
