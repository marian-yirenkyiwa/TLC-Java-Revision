package trade;

public class FundTrade extends Trade{
    private double fixedPercentage;

    public FundTrade(String id, String symbol, int quantity, double price, double fixedPercentage) {
        super(id, symbol, quantity, price);
        this.fixedPercentage = fixedPercentage;
    }

    public FundTrade(String id, String symbol, int quantity, double fixedPercentage) {
        super(id, symbol, quantity);
        this.fixedPercentage = fixedPercentage;
    }

    @Override
    public double calcDividend() {
        return getPrice() * fixedPercentage;
    }
}
