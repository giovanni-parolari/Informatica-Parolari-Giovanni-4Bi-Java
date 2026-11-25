public class Libro {

    String autore;

    public Libro(String t, String c, String autore) {
        super(c, t);
        this.autore = autore;
    }

    @Override
    public String descrizione() {
        return super.descrizione();
    }
}
