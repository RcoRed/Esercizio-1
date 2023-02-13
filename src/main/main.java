package main;

import main.model.products.*;
import main.model.store.Store;

public class main {
    public static void main(String[] args) {

        System.out.println("Inizio Programma");

        Store store = new Store();
        Product b1 = new Book("b1a001","The Lost Ring","fantasy",200,5,24.99);
        Product b2 = new Book("b2a002","We Found The Ring!","fantasy",125,2.78,19.99);
        Product b3 = new Book("b3a003","We Lost it, again...","fantasy",150,3.02,29.90);
        Product b4 = new Book("b4a004","The Old man","thriller",150,3.02,29.90);
        Product b5 = new Book("b5a005","Pinocchio 1","humorous",150,3.02,29.90);

        Product d1 = new Dvd("The Lost Ring","fantasy",120.56,0.9,15);
        Product d2 = new Dvd("We Found The Ring!","fantasy",120.56,0.3,9.99);
        Product d3 = new Dvd("We Lost it, again...","fantasy",120.56,0.4,19.90);

        Product p1 = new PadelRacket("apple","goccia",4.3,390);
        Product p2 = new PadelRacket("samsung","goccia",5,290.90);
        Product p3 = new PadelRacket("asus","rotonda",4,200);
        Product p4 = new PadelRacket("asus","diamante",5.2,110);

        int nProducts = store.numberOfProducts();
        System.out.println("In totale ci sono " + nProducts + " prodotti nello store");

        System.out.println();       //un po' di spazio

        double weightProducts = store.totalWeight();
        System.out.println("Il peso totale dei prodotti è " + weightProducts + " kg");

        System.out.println();       //un po' di spazio

        Product expensiveProduct = store.mostExpensive();
        System.out.println("Il prodotto più costoso è:");
        store.printProduct(expensiveProduct);

        System.out.println();       //un po' di spazio

        int nBooks = store.countBooksCategoryFantasy();
        System.out.println("Nel negozio sono presenti " + nBooks + " libri Fantasy!");

        System.out.println();       //un po' di spazio
        System.out.println("Le racchette a goccia presenti nel negoazio sono:");
        store.printArrayLists(store.SearchPadelRacketsDrop());

    }
}
