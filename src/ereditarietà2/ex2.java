package ereditarietà2;/*Scrivere un programma che contenga una classe chiamata Forma ed un metodo chiamato
 calcolaArea() che stampi l'area della ereditarietà2.forma.
Crea poi una sottoclasse chiamata Rettangolo che fa override del metodo calcolaArea()
 per calcolare l'area del ereditarietà2.ex2.rettangolo.*/


public class ex2 {
    public static void main(String[] args) {

        forma forma = new forma();
        forma.calcolaArea();

        rettangolo rettangolo = new rettangolo(2.0, 2.1);
        rettangolo.calcolaArea();

    }
}

