import java.util.Scanner;

public class InputClass {
    Scanner scanner = new Scanner(System.in);

    public void taskName() {
        System.out.println("Please enter the task you want to add to your calender: ");
        String taskName = scanner.nextLine();
    }
}


