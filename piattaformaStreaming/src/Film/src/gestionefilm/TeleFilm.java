package gestionefilm;

import java.util.Arrays;

public class TeleFilm {

    private String titolo;
    private GENERE genere;
    private STATO stato;
    private Stagione[] numStagioni;

    public TeleFilm() {
        this("", null, null, new Stagione[0]);
    }

    public TeleFilm(String titolo, GENERE genere, STATO stato, Stagione[] numStagioni) {
        this.titolo = titolo;
        this.genere = genere;
        this.stato = stato;
        this.numStagioni = numStagioni;
    }

    /**
     * 
     * @return la media delle puntate per stagione. Se non ci sono stagioni,
     *         restituisce 0.0
     */
    public double mediaPuntate() {
        if (numStagioni.length == 0) {
            return 0.0;
        }
        int somma = 0;
        for (int i = 0; i < numStagioni.length; i++) {
            somma += numStagioni[i].getNumEpisodi();
        }
        return (double) somma / numStagioni.length;
    }

    public boolean isSceneggiatore(String nomeSceneggiatore) {
        if (numStagioni.length == 0 || nomeSceneggiatore == null || nomeSceneggiatore.isEmpty()) {
            return false;
        }
        for (int i = 0; i < numStagioni.length; i++) {
            if(nomeSceneggiatore.equals(numStagioni[i].getNomeSceneggiatore())) {
                return true;
            }
        }
        return false;
    }


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public GENERE getGenere() {
        return genere;
    }

    public void setGenere(GENERE genere) {
        this.genere = genere;
    }

    public STATO getStato() {
        return stato;
    }

    public void setStato(STATO stato) {
        this.stato = stato;
    }

    public Stagione[] getNumStagioni() {
        return numStagioni;
    }

    public void setNumStagioni(Stagione[] numStagioni) {
        this.numStagioni = numStagioni;
    }

    @Override
    public String toString() {
        return "TeleFilm [titolo=" + titolo + ", genere=" + genere + ", stato=" + stato + ", numStagioni="
                + Arrays.toString(numStagioni) + "]";
    }

}
