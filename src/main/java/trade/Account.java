package trade;

public class Account {
    private double totalValueOfTrades;

    public Account(double totalValueOfTraders) {
        this.totalValueOfTrades = totalValueOfTraders;
    }

    //a setter for the total value of traders
    public void setTotalValueOfTrades(double totalValueOfTrades) {

        this.totalValueOfTrades = totalValueOfTrades;
    }

    //a getter for the total value of traders
    public double getTotalValueOfTrades() {

        return totalValueOfTrades;
    }


}
