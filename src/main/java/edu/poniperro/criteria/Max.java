package edu.poniperro.criteria;

import com.sun.source.tree.OpensTree;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.List;
import java.util.Optional;

public class Max implements Criteria {
    public Criteria criteria = null;
    public Criteria otherCriteria = null;

    public Max(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;       // "Max(Criteria, Criteria)" Se define asi
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        Criteria andCriteria = new AndCriteria(criteria, otherCriteria);

        Optional<Offer> offer = andCriteria.checkCriteria(item)
                .stream().max(Offer::compareTo);
        return offer.isPresent()? List.of(offer.get()) : List.of();

    }
}
