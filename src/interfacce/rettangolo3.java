package interfacce;

public class  rettangolo3 implements forma {

public double lunghezza;
public double larghezza;

    public rettangolo3(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;
    }

    public double calcolaArea(){
        return lunghezza * larghezza;
    }
}
