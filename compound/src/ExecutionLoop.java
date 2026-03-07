public class ExecutionLoop  {
    VariableInput input;

    public ExecutionLoop(VariableInput input){
        this.input = input;
    }
    public void executeWhileLoop(){
        double investmentAmount = input.getInvestmentAmount();
        double baseProfit = input.getPeriodProfit();
        double target = input.getTargetPeriodProfit();
        double incrementAmount = input.getPeriodProfit();
        double periodProfit = 0;

        System.out.println(incrementAmount);
        double totalProfit = 0;

        int periods = 0;
        int investments = 1;

        while(totalProfit < target){
            double currentPeriodProfit = baseProfit * investments;
            totalProfit += currentPeriodProfit;
            periods++;
            if (totalProfit >= investmentAmount * investments){
                investments++;

            }
        }

        System.out.println("Total profit: " + totalProfit);
        System.out.println("Periods needed: " + periods);
        System.out.println("Total investments: " + investments);
    }
}
