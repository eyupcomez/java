public class Calculator {
    UserInput input;
    public Calculator(UserInput input){
        this.input= input;
    }
    public void calculate(){
        System.out.println("Calculator started running.");
        double investmentSize = input.getInvestmentSize();
        double baseProfit = input.getProfitAmount();
        int investmentNumbers = input.getInvestmentNumbers();



    }
}
