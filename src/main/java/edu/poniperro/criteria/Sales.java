package edu.poniperro.criteria;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;
import edu.poniperro.item.Sale;

import java.util.List;
import java.util.stream.Collectors;

public class Sales implements Criteria {

    public Sales(){}


    @Override
    public List<Offer> checkCriteria(Item item) {
        return item.offers()
                .stream()
                .filter(o -> o instanceof Sale)
                .collect(Collectors.toList());
    }
}
