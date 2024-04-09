public class auto {

    private String targa;
    private String auto;
    private String modello;
    private int cilindrata;

    public auto(String targa, String auto, String modello, int cilindrata) {
        this.targa = targa;
        this.auto = auto;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    @Override
    public String toString() {
        return "auto{" +
                "targa='" + targa + '\'' +
                ", auto='" + auto + '\'' +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
}
