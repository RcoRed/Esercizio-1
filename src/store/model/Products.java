package store.model;

import store.Store;

import java.util.ArrayList;

public abstract class Products {
//    instance variables
    static Store store = new Store();
    private double weight;
    private double price;
    private String productType;

//    constructors
    public Products(){

    }
    public Products(double weight,double price,String productType){
        this.weight=weight;
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
        return this.getProductType();
    }
//    methods



}
