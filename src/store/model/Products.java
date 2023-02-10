package store.model;

public abstract class Products {
//    instance variables
    private double weight;
    private double price;

//    constructors
    public Products(){

    }
    public Products(double weight,double price){
        this.weight=weight;
        this.price=price;
    }
//    getter
    public double getWeight(){
        return this.weight;
    }
    public double getPrice(){
        return this.price;
    }


//    methods
}
