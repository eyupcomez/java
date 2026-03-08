import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    private double investmentSize;
    private double profitAmount;
    private double partitionPercentage;
    private int investmentNumbers;
    private String periodName;

    public void setInvestmentSize(){
        System.out.println("Please enter the amount of your first investment: ");
        this.investmentSize = scanner.nextDouble();
    }
    public double getInvestmentSize(){
        return investmentSize;
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

    public void setInvestmentNumbers() {
        System.out.println("Please enter the number of investments you want to reach: ");
        this.investmentNumbers = scanner.nextInt();
    }

    public int getInvestmentNumbers() {
        return investmentNumbers;
    }
}
