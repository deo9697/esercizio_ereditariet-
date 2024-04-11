package eserciziprofdevelhope;

import eserciziprofdevelhope.articolo;
import eserciziprofdevelhope.carrello;

public class esercizi {
    public static void main(String[] args) {

 articolo article1 = new articolo("pizzona",3.50 , 0.1);
 articolo article2= new articolo("pepsi",1.99, 0.2);
articolo article3= new articolo ("docle" , 2.99, 0.22);
 carrello carrello = new carrello(new articolo[]{article1, article2});
        System.out.println("eserciziprofdevelhope.carrello :");
        System.out.println("Numero di articoli:" + carrello.getarticoli().length);
        System.out.println("prezzo finale(senza iva) : " + carrello.getprezzoFinale(false));
        System.out.println("prezzo finale(con iva) : " + carrello.getprezzoFinale(true));

        carrello = new carrello(new articolo[]{article1, article2, article3});

System.out.println("eserciziprofdevelhope.carrello aggiornato:");
System.out.println("numero articoli:"+carrello.getarticoli().length);
        System.out.println("prezzo finale(senza iva) : " + carrello.getprezzoFinale(false));
        System.out.println("prezzo finale(con iva) : " + carrello.getprezzoFinale(true));

    }
}


