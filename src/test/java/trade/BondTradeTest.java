package trade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BondTradeTest {

    @Test
    void calcDividend() {
        //setup
        BondTrade bondTrade = new BondTrade("T1","WIN",80,14.35,5.45);

        //action
        double calcDividend = bondTrade.calcDividend();

        //verify
        assertEquals(5.45,calcDividend);
    }
}