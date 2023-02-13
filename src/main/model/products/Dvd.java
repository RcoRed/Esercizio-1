package main.model.products;

public class Dvd extends Product {
//    instance variables
    private String title;
    private String category;
    private double duration;

//    constructors
    public Dvd(){
        this(null,null,0,0,0);
    }
    public Dvd(String title, String category, double durationMinutes, double weightKG, double price){
        super(weightKG, price,"DVD");
        this.title = title;
        this.category = category;
        this.duration = durationMinutes;
    }
//    getter
    public String getTitle(){
        return this.title;
    }
    public String getCategory(){
        return this.category;
    }
    public double getDuration(){
        return this.duration;
    }
//    methods

}
