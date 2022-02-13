package edu.poniperro.criteria;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.ArrayList;
import java.util.List;

public class Size implements Criteria {
    public String size;

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item item) {
        ArrayList<Offer> tamañoSize = new ArrayList<Offer>();

        for (Offer offers : item.offers()){
            if (offers.size().equals(size)){
                tamañoSize.add(offers); // Si la oferta igual que tamaño añade oferta
            }
        }
        return tamañoSize;
    }
}
