import java.util.Arrays;

public class carrello {

    private articolo[] articoli;

    public carrello(articolo[] articoli){
        setarticoli(articoli);
    }

    public articolo[] getarticoli() {
        return articoli;
    }

    public void setarticoli (articolo[] articoli){
        this.articoli = articoli;
    }
    public double getprezzoFinale(boolean conIva){
        double prezzoFinale = 0.0;

        for (articolo articolo : articoli) {
            prezzoFinale += articolo.getPrezzo(conIva);
        }
return prezzoFinale;
    }



    @Override
    public String toString() {
        return "carrello{" +
                "articoli=" + Arrays.toString(articoli) +
                '}';
    }
}
