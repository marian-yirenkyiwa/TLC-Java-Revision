package trade;

public class Trader{
    private String traderName;
    private Account account;

    public Trader(String traderName, Account account) {
        this.traderName = traderName;
        this.account = account;
    }

    public void addTrade(Trade trade){
        double revenue = trade.getPrice() * trade.getQuantity();
        double totalValue = account.getTotalValueOfTrades() + revenue;
        account.setTotalValueOfTrades(totalValue);


            //--alternative method
//        double res1 = trade.getPrice() * trade.getQuantity() ;
//        double res2 = account.getTotalValueOfTrades();
//        double total = res1 + res2 ;
//         account.setTotalValueOfTrades(total);
    }

}
