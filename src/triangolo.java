public class triangolo extends formastratta {

    private double base;

    private double altezza;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public triangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public double calcolaArea() {
        return base * altezza / 2;
    }

}
