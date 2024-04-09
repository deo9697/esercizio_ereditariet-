package incapsulamento;/*Scrivere un programma che contenga una classe che definisce un Auto che abbia come proprietà cilindrata,
targa, marca e modello.
Per questa classe saranno necessari i metodi accessori (getters e setters) ed un costruttore.
Nel main dichiarare un oggetto di tipo Auto.
In questo caso la nota importante è rendere le proprietà della classe incapsulamento.auto accessibili solo attraverso i metodi.*/

public class newex {
    public static void main(String[] args) {

        auto auto = new auto("xx999pp", "punto" , "grande punto" , 92);
        System.out.println(auto);
    }
}
