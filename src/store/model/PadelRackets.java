package store.model;

public class PadelRackets extends Products{
//    instance variables
    private String brand;
    private String category;

//    constructors
    public PadelRackets(){
        this(null,null,0,0);
    }
    public PadelRackets(String brand,String category,double weight,double price){
        super(weight, price);
        this.brand = brand;
        this.category = category;
    }
//    getter
    public String getBrand(){
        return this.brand;
    }
    public String getCategory(){
        return this.category;
    }
//    methods

}
