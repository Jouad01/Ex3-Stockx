package edu.poniperro.criteria;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.List;

public interface Criteria {
    List<Offer> checkCriteria(Item item); // Se puede quitar public
}
