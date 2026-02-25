import java.util.Scanner;

public class PersonalAttributes {
    Scanner scanner = new Scanner(System.in);
    String name;
    int age;
    String occupation;

    public void askName(){
        System.out.println("Please enter the name of the family member: ");
        this.name = scanner.nextLine();
    }
    public void askAge(){
        System.out.println("Please enter member's age: ");
        this.age= scanner.nextInt();
    }
    public void askOccupation(){
        System.out.println("Please enter member's occupation: ");
        this.occupation = scanner.next();
    }
}
