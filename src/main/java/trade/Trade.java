package trade;

public abstract class Trade {
    private String id;
    private String symbol;
    private int quantity;
    private double price;

//a trade constructor with all attributes as its parameter
    public Trade(String id, String symbol, int quantity, double price){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
    }

    public Trade(String id, String symbol, int quantity){
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return
                "id: " + id + ' ' +
                ", symbol: " + symbol + ' ' +
                ", quantity: " + quantity + ' ' +
                ", price: " + price;
    }

    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
}
    public double getPrice(){
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //defining an abstract method called 'calcDividend'
    public abstract double calcDividend();
}




