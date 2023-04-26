package trade;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {

//    @BeforeEach
//    void setUp() {
////        Trade trade = new Trade("T1", "APPL", 100);
//
////        Mockito.when(trade.getPrice() > 0).thenReturn(Boolean.TRUE);
////        Mockito.when(trade.getPrice() < 0).thenReturn(Boolean.FALSE);
//
//
//
//    }


    @Test
    void TestSetPriceIsPositive() {

        //setup
        Trade t1 = new BondTrade("T1", "APPL", 100, 15.25, 12.78);

        //action
        t1.setPrice(90);

        //verify
        assertEquals(90,t1.getPrice());
    }

    @Test
    void TestSetPriceIsNegative() {

        //setup
        Trade t1 = new BondTrade("T1", "APPL", 100, 15.25, 12.78);

        //action
        t1.setPrice(-90);

        //verify
        assertEquals(15.25,t1.getPrice());
    }

    @Test
    void TestSetPriceIsNegativeForConstructorWithZeroPrice() {

        //setup
        Trade t1 = new BondTrade("T1", "APPL", 100,12.78);

        //action
        t1.setPrice(-90);

        //verify
        assertEquals(0,t1.getPrice());
    }


}