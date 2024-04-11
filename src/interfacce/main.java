package interfacce;

/*Scrivere un programma che contenga una interfaccia Forma ed un metodo chiamato calcolaArea().
Crea poi due sottoclassi Rettangolo e Triangolo che implementano Forma ed implementano il metodo per il calcolo
dell'area.
*/

public class main {
    public static void main(String[] args) {

        rettangolo3 rettangolo3 = new rettangolo3(10 , 15);
        System.out.println("area del rettangolo =" + rettangolo3.calcolaArea());

        triangolo triangolo = new triangolo(10 , 25);
        System.out.println("area del triangolo =" + triangolo.calcolaArea());
    }
}
