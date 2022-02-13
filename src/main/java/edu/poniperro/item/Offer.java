package edu.poniperro.item;

public interface Offer extends Comparable<Offer> { // Por que se extiende?¿
    String size();
    int value();
    int compareTo(Offer offer);
}
