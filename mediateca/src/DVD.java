public class DVD extends Materiale {

    String regista;

    public DVD(String t, String c, String regista) {
        super(c, t);
        this.regista = regista;
    }

    @Override
    public String descrizione() {
        return super.descrizione();
    }

}