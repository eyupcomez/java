import java.util.ArrayList;



public class MathOperations extends InputClass {




    ArrayList<Integer> numbers = new ArrayList<Integer>();
    InputClass inputClass = new InputClass();
    double result = 0;

    public void setNumbers() {
        this.numbers = inputClass.ask();
    }
    public void sum1(){
        for (Integer number : numbers) {
            result += number;
        }
        System.out.println("Sum: " + result);
    }

}








