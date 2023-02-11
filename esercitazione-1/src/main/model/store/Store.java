package main.model.store;

import main.model.products.*;

import java.util.ArrayList;

public class Store {
//    instance variables
    private static ArrayList<Products> productsList;
    private static ArrayList<Products> temp;
    private static Products product;
    private static Books book;
    private static DVDs dvd;
    private static PadelRackets padel;
//    constructors
    public Store(){
        this.productsList = new ArrayList<>();
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
    public Products mostExpensive(){
        double expensive=0;
        for (Products p:productsList){
            if (p.getPrice() > expensive) {
                expensive = p.getPrice();
                product = p;
            }
        }
        return product;
    }

    //3e richiesta
    public int countBooksCategoryFantasy(){
        return countBooksCategory("fantasy");
    }
    public int countBooksCategory(String category){
        int counter=0;
        for (Products p:productsList){
            //controllo di che tipo sia
            if (p.getProductType().equalsIgnoreCase("book")){
                //assegno il tipo corretto CASTANDOLO!
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
            //controllo di che tipo sia
            if (p.getProductType().equalsIgnoreCase("padelrackets")){
                //assegno il tipo corretto CASTANDOLO!
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
            System.out.println();       //un po' di spazio
        }
    }

    public void printProduct(Products p){
        if (p.getProductType().equalsIgnoreCase("book")){
            book = (Books) p;
            System.out.println(book.getProductType());
            System.out.println(book.getISBN());
            System.out.println(book.getTitle());
            System.out.println(book.getCategory());
            System.out.println(book.getPages());
            System.out.println(book.getWeight() + "Kg");
            System.out.println(book.getPrice() + "€");
        } else if (p.getProductType().equalsIgnoreCase("dvd")) {
            dvd = (DVDs) p;
            System.out.println(dvd.getProductType());
            System.out.println(dvd.getTitle());
            System.out.println(dvd.getCategory());
            System.out.println(dvd.getDuration() + " minutes");
            System.out.println(dvd.getWeight());
            System.out.println(dvd.getPrice());
        } else if (p.getProductType().equalsIgnoreCase("padelrackets")) {
            padel = (PadelRackets) p;
            System.out.println(padel.getProductType());
            System.out.println(padel.getBrand());
            System.out.println(padel.getType());
            System.out.println(padel.getWeight() + "Kg");
            System.out.println(padel.getPrice() + "€");
        }
    }



}
