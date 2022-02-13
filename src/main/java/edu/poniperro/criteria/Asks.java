package edu.poniperro.criteria;

import edu.poniperro.item.Ask;
import edu.poniperro.item.Item;
import edu.poniperro.item.Offer;

import java.util.List;
import java.util.stream.Collectors;

public class Asks implements Criteria{

    public Asks(){}

    @Override
    public List<Offer> checkCriteria(Item item) {
            return item.offers()
                    .stream()
                    .filter(o -> o instanceof Ask) // Es en instancia Ask asi que será verdadero
                    .sorted()
                    .collect(Collectors.toList());
        }
    }



