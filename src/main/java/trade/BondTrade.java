package trade;

public class BondTrade extends Trade{
    private double dividend;

    public BondTrade(String id, String symbol, int quantity, double price, double dividend) {
        super(id, symbol, quantity, price);
        this.dividend = dividend;
    }

    public BondTrade(String id, String symbol, int quantity, double dividend) {
        super(id, symbol, quantity);
        this.dividend = dividend;
    }

    @Override
    public double calcDividend() {
        return dividend;
    }
}
