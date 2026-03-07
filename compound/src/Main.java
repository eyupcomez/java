public class Main {



        public static void main (String[] args){
                VariableInput input = new VariableInput();
                input.setInvestmentAmount();
                input.getInvestmentAmount();
                input.setPeriodProfit();
                input.setTargetPeriodProfit();
                System.out.println(input.getInvestmentAmount());
                ExecutionLoop execute = new ExecutionLoop(input);
                execute.executeWhileLoop();

        }

}
