package edu.poniperro.item;

public class Bid implements Offer {
    private String size = "";
    private Integer bid = 0;


    public Bid(String size, int bid){
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.bid.intValue(); // Al ser value devuelve el valor que es integer
    }

    @Override
    public int compareTo(Offer bid){
       return this.bid.compareTo(bid.value()); // Duda con esto
    }

    @Override
    public String toString() {
        return "\t\t" + this.size() + "\t" + this.value() + "\n";
    }
}
