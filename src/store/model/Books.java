package store.model;

public class Books extends Products{
//    instance variables
    public final String ISBN;
    private String title;
    private String category;
    private int pages;

    Books b;

//    constructors
    public Books(){
        this(null,null,null,0,0,0);
    }
    public Books(String ISBN,String title,String category,int pages,double weight,double price){
        super(weight, price,"book");
        this.ISBN = ISBN;
        this.title = title;
        this.category = category;
        this.pages = pages;
    }
//    getter
    public String getISBN(){
        return this.ISBN;
    }
    public String getTitle(){
        return this.title;
    }
    public String getCategory(){
        return this.category;
    }
    public int getPages(){
        return this.pages;
    }
//    methods

}
