public class Stagione {

    private int numEpisodi;
    private String nomeSceneggiatore;
    private String trama;
    private int numStagione;

    public Stagione(int numEpisodi, String nomeSceneggiatore, String trama, int numStagione){
        
        this.numEpisodi = numEpisodi;
        this.nomeSceneggiatore = nomeSceneggiatore;
        this.trama = trama;
        this.numStagione = numStagione;
    }

    public Stagione(){
        
    }
    public int getNumEpisodi() {
        return numEpisodi;
    }


    public void setNumEpisodi(int numEpisodi) {
        this.numEpisodi = numEpisodi;
    }


    public String getNomeSceneggiatore() {
        return nomeSceneggiatore;
    }


    public void setNomeSceneggiatore(String nomeSceneggiatore) {
        this.nomeSceneggiatore = nomeSceneggiatore;
    }


    public String getTrama() {
        return trama;
    }


    public void setTrama(String trama) {
        this.trama = trama;
    }


    public int getNumStagione() {
        return numStagione;
    }


    public void setNumStagione(int numStagione) {
        this.numStagione = numStagione;
    }


    @Override
    public String toString() {
        return "Stagione{" +
                "numEpisodi=" + numEpisodi +
                ", nomeSceneggiatore='" + nomeSceneggiatore + '\'' +
                ", trama='" + trama + '\'' +
                ", numStagione=" + numStagione +
                '}';
    }

}