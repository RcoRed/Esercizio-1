package main.model.products;

import main.model.store.Store;

public class productsStart {
    public static void main(String[] args) {

        Store store1 = new Store();
        //riempimento
        Books b1 = new Books("leirhfgreiujgh","titolo","fantasy",500,5,30);
        System.out.println("aggiunti!");
        System.out.println(b1.getTitle());
        System.out.println(b1.getPrice());
        System.out.println(b1.getPages());
        System.out.println(b1.getWeight());
        System.out.println(b1.getISBN());
        Books b2 = new Books("kluewfgrhleiruy","titolo","fantasy",50,1,40);
        System.out.println("aggiunti!");
        System.out.println(b2.getTitle());
        System.out.println(b2.getPrice());
        System.out.println(b2.getPages());
        System.out.println(b2.getWeight());
        System.out.println(b2.getISBN());
        PadelRackets p1 = new PadelRackets("tito","goccia",5,200);
        System.out.println("aggiunti!");
        System.out.println(p1.getBrand());
        System.out.println(p1.getPrice());
        System.out.println(p1.getType());
        System.out.println(p1.getWeight());

        //prova dei metodi creati
        System.out.println("in totale ci sono " + store1.numberOfProducts() + " prodotti");
        System.out.println("il peso totale dei prodotti è " + store1.totalWeight() + " kg");
        System.out.println("il più costoso vale " + store1.mostExpensive() + "$");
        System.out.println("sono presenti " + store1.countBooksCategoryFantasy() + " libri Fantasy");
        store1.printArrayLists(store1.SearchPadelRacketsDrop());

    }
}
