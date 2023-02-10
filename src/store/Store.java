package store;

import store.model.Products;

import java.util.ArrayList;

public class Store {
//    instance variables
    private static ArrayList<Products> productsList = new ArrayList<>();
    private static Products product;
//    constructors
    public Store(){

    }

//    getter
    public ArrayList getProductsList(){
        return this.productsList;
    }

//    methods
    public void AddToList(Products product){
        productsList.add(product);
    }

    //3a richiesta
    public int numberOfProducts(){
        return productsList.size();
    }

    //3b richiesta
    public double totalWeight(){
        double total=0;
        for (Products p:productsList){
            total += p.getWeight();
        }
        return total;
    }

    //3c richiesta
    public double mostExpensive(){
        double expensive=0;
        for (Products p:productsList){
            if (expensive<p.getPrice())
                expensive = p.getPrice();
        }
        return expensive;
    }

    //3d richiesta




}
