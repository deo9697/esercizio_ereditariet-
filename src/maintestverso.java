/*Scrivere un programma che contenga una classe chiamata Animale ed un metodo chiamato faiIlVerso() che stampi il verso dell'animale.
Crea poi una sottoclasse chiamata Gatto che fa override del metodo faiIlVerso() per miagolare.
Prova quindi a far stampare il verso di Animale e di Gatto.*/

public class maintestverso {
    public static void main(String[] args) {


        animali animali = new animali();
        gatto gatto = new gatto();
        gatto.faIlVerso();

     //System.out.println("gatto :" + gatto);

    }
}