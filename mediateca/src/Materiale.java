public class Materiale extends  Object{

    protected String codice;
    protected String titolo;

    public Materiale(String codice, String titolo) {
        this.codice = codice;
        this.titolo = titolo;

    }

    public String descrizione() {
        return codice + " - " + titolo;
    }

    @Override
    public String toString() {
        return "Codice " + codice + ", Titolo " + titolo;}
}
