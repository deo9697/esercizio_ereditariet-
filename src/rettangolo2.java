public class rettangolo2 extends formastratta {

    private double altezza;

    private double base;

    public double getAltezza() {
        return altezza;
    }

    public rettangolo2(double altezza, double base) {
        this.altezza = altezza;
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
