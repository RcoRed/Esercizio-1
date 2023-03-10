package main.model.products;

public class Book extends Product {
//    instance variables
    public final String ISBN;
    private String title;
    private String category;
    private int pages;

    Book b;

//    constructors
    public Book(){
        this(null,null,null,0,0,0);
    }
    public Book(String ISBN, String title, String category, int pages, double weightKG, double price){
        super(weightKG, price,"book");
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
