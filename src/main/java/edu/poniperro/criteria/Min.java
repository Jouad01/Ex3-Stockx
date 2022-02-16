package edu.poniperro.criteria;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.List;
import java.util.Optional;

public class Min implements Criteria{
    private Criteria criteria = null;
    private Criteria otherCriteria = null;

    public Min(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria AndCriteria = new AndCriteria(criteria, otherCriteria);

        Optional<Offer> offer = AndCriteria.checkCriteria(item)
                .stream()
                .min(Offer::compareTo);        // Lo mismo que en Max pero cambiando max por min
        return offer.isPresent()? List.of(offer.get()) : List.of();

    }
}
