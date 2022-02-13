package edu.poniperro.item;

import java.util.List;

public interface Item {
    int getBid();
    int getAsk();
    int getSale();
    void add(Offer offer); // Oferta
    List<Offer> offers();
    void setBid(int bid);
    void setAsk(int ask);
    void setSale(int sale); // No estoy seguro si hay que especificarlo


}
