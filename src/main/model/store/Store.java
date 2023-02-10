package main.model.store;

import main.model.products.Books;
import main.model.products.PadelRackets;
import main.model.products.Products;

import java.util.ArrayList;

public class Store {
//    instance variables
    private static ArrayList<Products> productsList = new ArrayList<>();
    private static ArrayList<Products> temp;
    private static Products product;
    private static Books book;
    private static PadelRackets padel;
//    constructors
    public Store(){

    }

//    getter
    public ArrayList getProductsList(){
        return this.productsList;
    }

//    methods
    public void AddToList(Products product){
        productsList.add(product);
    }

    //3a richiesta
    public int numberOfProducts(){
        return productsList.size();
    }

    //3b richiesta
    public double totalWeight(){
        double total=0;
        for (Products p:productsList){
            total += p.getWeight();
        }
        return total;
    }

    //3c richiesta
    public double mostExpensive(){
        double expensive=0;
        for (Products p:productsList){
            if (expensive<p.getPrice())
                expensive = p.getPrice();
        }
        return expensive;
    }

    //3e richiesta
    public int countBooksCategoryFantasy(){
        return countBooksCategory("fantasy");
    }
    public int countBooksCategory(String category){
        int counter=0;
        for (Products p:productsList){
            if (p.getProductType().equalsIgnoreCase("book")){
                book=(Books) p;
                if (book.getCategory().equalsIgnoreCase(category)){
                    counter++;
                }
            }
        }
        return counter;
    }

    //3f richiesta
    public ArrayList SearchPadelRacketsDrop(){
        temp = new ArrayList<>();
        for (Products p:productsList){
            if (p.getProductType().equalsIgnoreCase("padelrackets")){
                padel=(PadelRackets) p;
                if (padel.getType().equalsIgnoreCase("goccia") && p.getPrice()>100){
                    temp.add(p);
                }
            }
        }
        return temp;
    }

    public void printArrayLists(ArrayList<Products> arrayList){
        for (Products a:arrayList){
            if (a.getProductType().equalsIgnoreCase("padelrackets")){
                padel=(PadelRackets) a;
                System.out.println(padel.getBrand());
                System.out.println(padel.getType());
                System.out.println(padel.getWeight());
                System.out.println(padel.getPrice());
            }
        }
    }



}
