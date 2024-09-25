public class TipCalculator {
    private double billAmt;
    private double percentTip;
    private int numPeople;

    public TipCalculator(double billAmt, double percentTip,int numPeople){
        this.billAmt = billAmt;
        this.percentTip = percentTip;
        this.numPeople = numPeople;
    }

    public double calcTipTotal()

    {
        return billAmt * percentTip;
    }
    public double calcFinalBill()
    {
        return billAmt * (1 + percentTip);
    }

    public double calcEachPersonPay()
    {
        return calcFinalBill()/numPeople;
    }
    public double calcTipEachPerson()
    {
        return calcTipTotal()/numPeople;
    }

    public void printBill()
    {
        System.out.println("----------------------------------------------");
        System.out.println("Total Bill Per Person: $" + String.format("%.2f", calcEachPersonPay())); // This stat is displayed first because it is the most useful
        System.out.println("----------------------------------------------");
        System.out.println("Final Bill: $" + String.format("%.2f", calcFinalBill())); // This follows total bill per person in terms of importance for the average customer
        System.out.println("----------------------------------------------");
        System.out.println("Tip Per Person: $" + String.format("%.2f", calcTipEachPerson()));
        System.out.println("----------------------------------------------");
        System.out.println("Total Tip: $" + String.format("%.2f", calcTipTotal()));
        System.out.println("----------------------------------------------");
    }

}
