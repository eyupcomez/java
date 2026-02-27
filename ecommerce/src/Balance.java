import java.util.Scanner;

public class Balance {
    Scanner scanner = new Scanner(System.in);
    double balance= 0;

    public void displayBalance(){
        System.out.println(balance);
    }
    public void deposit(){
        System.out.println("Please enter the amount you want to deposit: ");
        double deposit = scanner.nextDouble();
        balance= balance+deposit;
        System.out.println("New balance: " + balance);
    }


}
