package interfacce;

public class triangolo implements forma{

public double base;
public double altezza;

    public triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;

        }

    public double calcolaArea() {
        return  base * altezza / 2 ;
    }
}
