package applicazione;

import gestionefilm.Stagione;

public class MainTelefilm {
    public static void main(String[] args) throws Exception {

        Stagione stagione1 = new Stagione(10, "John Doe", "A thrilling story", 1);
        Stagione stagione2 = new Stagione();
        Stagione stagione3 = new Stagione(13, "John Doe", "A thrilling story", 3);
    }
}
