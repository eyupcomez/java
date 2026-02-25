import java.util.ArrayList;
import java.util.Scanner;

public class InputClass {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Integer> ask(){
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Please enter how many inputs you will provide: ");
        int length = scanner.nextInt();

        for(int i = 0; i < length; i++){
            System.out.println("Please enter a number: ");
            int number = scanner.nextInt();
            numbers.add(number);
        }

        return numbers;
    }
}