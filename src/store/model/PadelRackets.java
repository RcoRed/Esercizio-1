package store.model;

public class PadelRackets extends Products{
//    instance variables
    private String brand;
    private String type;

//    constructors
    public PadelRackets(){
        this(null,null,0,0);
    }
    public PadelRackets(String brand,String type,double weight,double price){
        super(weight, price,"padelRackets");
        this.brand = brand;
        this.type = type;
    }
//    getter
    public String getBrand(){
        return this.brand;
    }
    public String getCategory(){
        return this.type;
    }
//    methods


}
