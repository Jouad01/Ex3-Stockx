package edu.poniperro.criteria;

import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LastSale implements Criteria{

    public LastSale(){}

    @Override
    public List<Offer> checkCriteria(Item item){ // item vendria siendo sneaker
        Criteria sales = new Sales();               // Fallo mio a la hora de elegir nombre
        List<Offer> listaSales = sales.checkCriteria(item);

        return listaSales.isEmpty()? List.of() : List.of(listaSales.get(listaSales.size() - 1));
        // Duda
    }

}
