package edu.poniperro.item;

public class Sale implements Offer {
    private String size = "";
    private Integer price = 0;

    public Sale(String size, int price){
        this.size = size;
        this.price = price;
    }

    @Override
    public String size(){
        return this.size;
    }

    @Override
    public int value(){
        return this.price;
    }

    @Override
    public int compareTo(Offer sale){
       return this.price.compareTo(sale.value()); // Void en vez de int
    }

    @Override
    public String toString(){
        return "\t\t" + this.size() + "\t" + this.value() + "\n";

    }

}
