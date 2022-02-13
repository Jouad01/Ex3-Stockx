package edu.poniperro.criteria;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class AndCriteria implements Criteria {
    public Criteria criteria = null; // Se deja en null porque el diagrama no especifica nada mas
    public Criteria otherCriteria  = null;

    public AndCriteria(Criteria criteria, Criteria otherCriteria){
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        List<Offer> firstCriteria = criteria.checkCriteria(item);
        List<Offer> secondCriteria = criteria.checkCriteria(item);

        List<Offer> jordan = new ArrayList<Offer>();
        for (Offer offer: firstCriteria){               // Duda
            if (secondCriteria.contains(offer)) {
                jordan.add(offer);
            }
        }
        return jordan;
    }
}

