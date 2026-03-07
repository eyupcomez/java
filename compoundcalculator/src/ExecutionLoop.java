public class ExecutionLoop {
    VariableInput input = new VariableInput();
    double incrementAmount = input.getPeriodProfit();
    public void executeWhileLoop(){
        double periodProfit = 0;
        while(incrementAmount< input.getTargetPeriodProfit()){

            periodProfit = periodProfit + input.getPeriodProfit();


        }
        System.out.println(periodProfit);
    }
}
