package main.model.products;

import main.model.store.Store;

public abstract class Product {
//    instance variables
    static Store store = new Store();
    private double weight;
    private double price;
    private String productType;

//    constructors
    public Product(){

    }
    public Product(double weightKG, double price, String productType){
        this.weight=weightKG;
        this.price=price;
        this.productType=productType;
        store.AddToList(this);
    }
//    getter
    public double getWeight(){
        return this.weight;
    }
    public double getPrice(){
        return this.price;
    }
    public String getProductType(){
        return this.productType;
    }
//    methods

}
