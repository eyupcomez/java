import java.util.Scanner;

public class VariableInput {
    Scanner scanner = new Scanner(System.in);
    private double investmentAmount;
    private double periodProfit;
    private double targetPeriodProfit;

    public void setInvestmentAmount() {
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

    public double getPeriodProfit() {
        return periodProfit;
    }

    public void setTargetPeriodProfit() {
        System.out.println("Please enter the target period profit you want to reach: ");
        this.targetPeriodProfit = scanner.nextDouble();
    }
    public double getTargetPeriodProfit(){
        return targetPeriodProfit;
    }


}


