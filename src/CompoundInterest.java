public class CompoundInterest {
    public static void main(String args[]){

        for(double interestRate=7.5 ; interestRate <=10; interestRate+=0.25){
            double interestAmount= calculateInterest(100,interestRate);
                    System.out.println("100 dollars " + "at interest rate of " + interestRate + "turns upto" + interestAmount);

        }
    }
    public static double calculateInterest(int amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
