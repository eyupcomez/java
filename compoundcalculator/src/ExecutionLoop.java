public class ExecutionLoop extends VariableInput {
    VariableInput input;

    public ExecutionLoop(VariableInput input){
        this.input = input;
    }
    public void executeWhileLoop(){
        double incrementAmount = input.getPeriodProfit();
        double periodProfit = 0;

        System.out.println(incrementAmount);

        int periods = 0;

        while(periodProfit < input.getTargetPeriodProfit()){
            periodProfit += input.getPeriodProfit();
            periods++;
        }

        System.out.println("Total profit: " + periodProfit);
        System.out.println("Periods needed: " + periods);
    }
}
