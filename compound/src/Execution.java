public class Execution {
        VariableInput input;

        public Execution(VariableInput input){
            this.input = input;
        }
        public  void execute(){
            double investmentAmount = input.getInvestmentAmount();
            double baseProfit = input.getPeriodProfit();
            double target = input.getTargetPeriodProfit();

            System.out.println("Program has started working:");
            double totalProfit = 0;
            double investmentProgress = 0;
            int periods = 0;
            int investments = 1;




            while (totalProfit < target){

                double currentPeriodProfit = baseProfit * investments;

                totalProfit += currentPeriodProfit;
                investmentProgress += currentPeriodProfit;

                periods++;

                if (investmentProgress >= investmentAmount){
                    investments++;
                    investmentProgress = 0;
                }
            }
            System.out.println("Total profit: " + totalProfit);
            System.out.println("Periods needed: " + periods);
            System.out.println("Total investments: " + investments);


        }
    }


