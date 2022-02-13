package edu.poniperro.criteria;

import edu.poniperro.item.Bid;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bids implements Criteria {
   public Bids(){}

    @Override
    public List<Offer> checkCriteria(Item item){
        return item.offers()
                .stream()
                .filter(o -> o instanceof Bid) // Es en instancia Bid asi que será verdadero
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
