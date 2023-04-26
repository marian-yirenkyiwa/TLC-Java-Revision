package trade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FundTradeTest {

    @Test
    void calcDividend() {

        //setup
        FundTrade fundTrade = new FundTrade("T1","WIN",69,2, 0.5);

        //action
        double calDividend = fundTrade.calcDividend();

        //verify
        assertEquals(1, calDividend);
    }
}