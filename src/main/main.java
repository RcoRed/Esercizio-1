package main;

import main.model.products.*;
import main.model.store.Store;

public class main {
    public static void main(String[] args) {

        System.out.println("Inizio Programma");

        Store store = new Store();
        Products b1 = new Books("b1a001","The Lost Ring","fantasy",200,5,24.99);
        Products b2 = new Books("b2a002","We Found The Ring!","fantasy",125,2.78,19.99);
        Products b3 = new Books("b3a003","We Lost it, again...","fantasy",150,3.02,29.90);
        Products b4 = new Books("b4a004","The Old man","thriller",150,3.02,29.90);
        Products b5 = new Books("b5a005","Pinocchio 1","humorous",150,3.02,29.90);

        Products d1 = new DVDs("The Lost Ring","fantasy",120.56,0.9,15);
        Products d2 = new DVDs("We Found The Ring!","fantasy",120.56,0.3,9.99);
        Products d3 = new DVDs("We Lost it, again...","fantasy",120.56,0.4,19.90);

        Products p1 = new PadelRackets("apple","goccia",4.3,390);
        Products p2 = new PadelRackets("samsung","goccia",5,290.90);
        Products p3 = new PadelRackets("asus","rotonda",4,200);
        Products p4 = new PadelRackets("asus","diamante",5.2,110);

        int nProducts = store.numberOfProducts();
        System.out.println("In totale ci sono " + nProducts + " prodotti nello store");

        System.out.println();       //un po' di spazio

        double weightProducts = store.totalWeight();
        System.out.println("Il peso totale dei prodotti è " + weightProducts + " kg");

        System.out.println();       //un po' di spazio

        Products expensiveProduct = store.mostExpensive();
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
