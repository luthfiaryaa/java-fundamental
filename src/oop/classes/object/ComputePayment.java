package oop.classes.object;

public class ComputePayment {
    public double computePayment(double loanAmt, double rate, double futureValue,int numPeriods) {
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest), - numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator)- ((futureValue * partial1) / denominator);
        return answer;
    }
    public static void main(String[] args) {
        ComputePayment computepayment = new ComputePayment();
        System.out.println(computepayment.computePayment(10, 100, 10, 10));
    }
}
