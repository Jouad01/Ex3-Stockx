package edu.poniperro.criteria;

import edu.poniperro.criteria.Asks;
import edu.poniperro.item.Ask;
import edu.poniperro.item.Bid;
import edu.poniperro.item.Sale;
import edu.poniperro.item.Sneaker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_Stockx {
    @Test
    public void TestBid(){
        Bid bid = new Bid("9.5", 282);
        assertEquals(282, bid.value());
        assertEquals("9.5", bid.size());
    }

    @Test
    public void TestSneaker(){
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        assertEquals("555088-105", sneaker.getStyle());
        assertEquals("Jordan 1", sneaker.getName());
    }

    @Test
    public void TestSale(){
        Sale sale = new Sale("9.5", 200);
        assertEquals("9.5", sale.size());
        assertEquals(200, sale.value());
    }

    @Test
    public void TestAsk(){
        Ask ask = new Ask("13", 550);
        assertEquals("13", ask.size());
        assertEquals(550, ask.value());
    }

    // Criteria

    @Test
    public void TestAsks(){
        Sneaker sneaker = new Sneaker("555088-105","Jordan 1");
        sneaker.add(new Ask("6", 600));

        assertEquals(600, sneaker.offers().get(0).value());
        assertEquals("6", sneaker.offers().get(0).size());
    }
}
