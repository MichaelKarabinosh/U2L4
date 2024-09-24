public class TipCalculator {
    private double billAmt;
    private double percentTip;
    private int numPeople;

    public TipCalculator(double billAmt, double percentTip,int numPeople){
        this.billAmt = billAmt;
        this.percentTip = percentTip;
        this.numPeople = numPeople;
    }

    public double tipTotal;{
        tipTotal = billAmt * percentTip;
    }
    public double finalBill;
    {
        finalBill = billAmt * (1 + percentTip);
    }

    public double eachPersonPay;
    {
    eachPersonPay = finalBill/numPeople;
    }

}
