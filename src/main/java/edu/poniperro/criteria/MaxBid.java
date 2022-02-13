package edu.poniperro.criteria;

import edu.poniperro.item.Ask;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.List;
import java.util.Optional;

public class MaxBid implements Criteria {
    public MaxBid(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> maxBid = item.offers()
                .stream()
                .filter(o -> o instanceof Ask)
                .max(Offer::compareTo);
        return maxBid.isPresent() ? List.of(maxBid.get()) : List.of();
    }
}
