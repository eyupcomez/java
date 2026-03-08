import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    private double investmentAmount;
    private double profitAmount;
    private double partitionPercentage;
    private String periodName;

    public void setInvestmentAmount(){
        System.out.println("Please enter the amount of your first investment: ");
        this.investmentAmount = scanner.nextDouble();
    }
    public double getInvestmentAmount(){
        return investmentAmount;
    }
    public void setProfitAmount(){
        System.out.println("Please enter the profit amount you are expecting: ");
        this.profitAmount = scanner.nextDouble();
    }

    public double getProfitAmount() {
        return profitAmount;
    }
    public void setPartitionPercentage(){
        System.out.println("Please enter the percentage of your profits you want to allocate for your new investments: ");
        this.partitionPercentage= scanner.nextDouble();
    }

    public double getPartitionPercentage() {
        return partitionPercentage;
    }
    public void setPeriodName(){
        System.out.println("Which period type do you receive your profits: ");
        this.periodName = scanner.nextLine();
    }
    public String getPeriodName(){
        return periodName;
    }
}
