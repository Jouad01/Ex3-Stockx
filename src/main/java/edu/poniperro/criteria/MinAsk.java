package edu.poniperro.criteria;

import edu.poniperro.item.Ask;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinAsk implements Criteria {
    public MinAsk(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
        Optional<Offer> minAsk = item.offers()
                .stream()
                .filter(o -> o instanceof Ask)
                .min(Offer::compareTo);
    return minAsk.isPresent() ? List.of(minAsk.get()) : List.of();
    }
}
