import java.util.Arrays;

public class CollezioneTelefilm {
/**
 * gli attributi utili alla gestione di un vettore di Telefilm
 *il costruttore di default, il costruttore parametrizzato, i metodi get e set, il metodo toString
 *un metodo per aggiungere un telefilm al vettore
 *un metodo che ordina il vettore dei telefilm in base al nome
 */

    private TeleFilm[] telefilm;
    private int numTelefilm;

    public CollezioneTelefilm() {
        this.telefilm = new TeleFilm[10];
        this.numTelefilm = 0;
    }

    public CollezioneTelefilm(TeleFilm[] telefilm) {
        this.telefilm = telefilm;
        this.numTelefilm = telefilm.length;
    }

    public TeleFilm[] getTelefilm() {
        return telefilm;
    }

    public void setTelefilm(TeleFilm[] telefilm) {
        this.telefilm = telefilm;
        this.numTelefilm = telefilm.length;
    }

    public int getNumTelefilm() {
        return numTelefilm;
    }

    public void setNumTelefilm(int numTelefilm) {
        this.numTelefilm = numTelefilm;
    }

    @Override
    public String toString() {
        return "CollezioneTelefilm{" +
                "telefilm=" + Arrays.toString(Arrays.copyOf(telefilm, numTelefilm)) +
                '}';
    }

    /**
     * Aggiunge un telefilm al vettore. Se il vettore e' pieno, viene
     * automaticamente ridimensionato (raddoppiato).
     */
    public void aggiungiTelefilm(TeleFilm t) {
        if (numTelefilm == telefilm.length) {
            telefilm = Arrays.copyOf(telefilm, telefilm.length == 0 ? 1 : telefilm.length * 2);
        }
        telefilm[numTelefilm] = t;
        numTelefilm++;
    }

    /**
     * Ordina il vettore dei telefilm in base al nome (ordine alfabetico).
     */
    public void ordinaPerNome() {
        for (int i = 0; i < numTelefilm - 1; i++) {
            for (int j = 0; j < numTelefilm - 1 - i; j++) {
                if (telefilm[j].getTitolo().compareToIgnoreCase(telefilm[j + 1].getTitolo()) > 0) {
                    TeleFilm temp = telefilm[j];
                    telefilm[j] = telefilm[j + 1];
                    telefilm[j + 1] = temp;
                }
            }
        }
    }
}