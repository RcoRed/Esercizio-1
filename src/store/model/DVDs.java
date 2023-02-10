package store.model;

public class DVDs extends Products{
//    instance variables
    private String title;
    private String category;
    private double duration;

//    constructors
    public DVDs(){
        this(null,null,0,0,0);
    }
    public DVDs(String title,String category,double duration,double weight,double price){
        super(weight, price);
        this.title = title;
        this.category = category;
        this.duration = duration;
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
