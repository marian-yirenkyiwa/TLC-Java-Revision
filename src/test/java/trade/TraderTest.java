package trade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TraderTest {

    @Test
    void TestAddTrade() {

        //-- setup --
        //create an instance of the trade class to be able to access the price and quantity attributes
        Trade trade = new BondTrade("T1", "WIN", 150, 17.15);

        //create an instance of the Account class to be able to access the totalValueOofTrades attribute
        Account account = new Account(7);

        //create an instance of the Trader class to be able to make use of the addTrade method
        Trader trader = new Trader("Marie", account);


        //-- take action --

        trader.addTrade(trade);
        double totalValueOfTrades = account.getTotalValueOfTrades();


        //verify that the test runs as expected
        assertEquals(2579.5,totalValueOfTrades);




            //-- Alternative test solution
//        //SETUP
//        Account account = new Account(5);
//        Trader trader = new Trader("010101M",account);
//        Trade trade = new Trade("010101M","T1",10,50.0);
//
//
//        //ACTION
//       trader.addTrade(trade);
//
//
//        //VERIFY
//       assertEquals(505,account.getTotalValueOfTraders());


    }
}