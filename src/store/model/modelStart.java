package store.model;

import store.Store;

public class modelStart {
    static Store store = new Store();
    public static void main(String[] args) {

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

        System.out.println("in totale ci sono " + store.numberOfProducts() + " prodotti");
        System.out.println("il peso totale dei prodotti è " + store.totalWeight() + " kg");
        System.out.println("il più costoso vale " + store.mostExpensive() + "$");

    }
}
