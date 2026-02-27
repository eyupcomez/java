public class BasePayment {




    public void accepted(){

        System.out.println("Payment method is accepted: " + getClass().getSimpleName());
    }
    public void declined(){
        System.out.println("Payment method is declined: "
                + getClass().getSimpleName() + " " + "Please try again. ");
    }
}