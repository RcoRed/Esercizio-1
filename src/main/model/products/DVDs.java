package main.model.products;

public class DVDs extends Products{
//    instance variables
    private String title;
    private String category;
    private double duration;

//    constructors
    public DVDs(){
        this(null,null,0,0,0);
    }
    public DVDs(String title,String category,double durationMinutes,double weightKG,double price){
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
