public class Main {



        public static void main (String[] args){
                VariableInput input = new VariableInput();
                input.setInvestmentAmount();
                input.getInvestmentAmount();
                input.setPeriodProfit();
                input.setTargetPeriodProfit();

                Execution execute = new Execution(input);
                execute.execute();

        }

}
