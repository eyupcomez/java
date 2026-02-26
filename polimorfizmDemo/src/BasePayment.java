public class BasePayment {

    public void accepted(String message){
        System.out.println("Payment method is accepted: " + message);
    }
    public void declined(String message){
        System.out.println("Payment method is declined: "
                + message + " " + "Please try again. ");
    }
}
