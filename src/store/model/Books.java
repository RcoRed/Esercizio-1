package store.model;

public class Books extends Products{

//    instance variables
    private String isbn;
    private String title;
    private String category;
    private int pages;

//    constructors
    public Books(){
        this(null,null,null,0,0,0);
    }
    public Books(String isbn,String title,String category,int pages,double weight,double price){
        super(weight, price);
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.pages = pages;
    }
//    getter
    public String getIsbn(){
        return this.isbn;
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
