/*Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato
 calcolaArea() che stampi l'area della forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
 per calcolare l'area del rettangolo.*/


public class ex2 {
    public static void main(String[] args) {

        forma forma = new forma();
        forma.calcolaArea();

        rettangolo rettangolo = new rettangolo();
        rettangolo.calcolaArea();

    }
}
