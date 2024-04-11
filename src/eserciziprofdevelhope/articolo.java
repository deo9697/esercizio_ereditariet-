package eserciziprofdevelhope;

public class articolo {
    private final String nome;

    private final double prezzo;

    private final double iva;

    public articolo(String nome, double prezzo, double iva) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.iva = iva;
    }

    @Override
    public String toString() {
        return "eserciziprofdevelhope.articolo{" +
                "nome='" + nome + '\'' +
                ", prezzo=" + prezzo +
                ", iva=" + iva +
                '}';
    }

    public double getPrezzo(boolean conIva) {
        if (conIva) {
            return prezzo + prezzo + iva;
        } else {
            return prezzo;
        }


        }

}
