import java.util.Scanner;

public class VariableInput {
    private double investmentAmount = 0;
    private double periodProfit = 0;
    Scanner scanner = new Scanner(System.in);

    public void setInvestmentAmount(){
        System.out.println("Please enter the amount of the investment: ");
        this.investmentAmount = scanner.nextDouble();

    }

    public double getInvestmentAmount() {
        return investmentAmount;
    }

    public void setPeriodProfit() {
        System.out.println("Please enter the profit amount per period: ");
        this.periodProfit = scanner.nextDouble();
    }
    public double getPeriodProfit(){
        return periodProfit;
    }
}
