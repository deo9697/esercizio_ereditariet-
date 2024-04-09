public class rettangolo extends forma {
    private double lunghezza;

    private double larghezza;

    @Override
    public void calcolaArea() {
        double area = lunghezza * larghezza;
        System.out.println("l'area è:" + area);
    }

    public void rettangolo(double lunghezza, double larghezza) {
        this.lunghezza = lunghezza;
        this.larghezza = larghezza;


    }
}
