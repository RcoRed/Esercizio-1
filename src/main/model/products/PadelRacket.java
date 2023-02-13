package main.model.products;

public class PadelRacket extends Product {
//    instance variables
    private String brand;
    private String type;

//    constructors
    public PadelRacket(){
        this(null,null,0,0);
    }
    public PadelRacket(String brand, String type, double weight, double price){
        super(weight, price,"padelRackets");
        this.brand = brand;
        this.type = type;
    }
//    getter
    public String getBrand(){
        return this.brand;
    }
    public String getType(){
        return this.type;
    }
    public String getCategory(){
        return this.type;
    }
//    methods

}
