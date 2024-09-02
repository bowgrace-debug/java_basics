package aufgaben.a34_Banking.banking.versionNew;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 02.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Bankkonto konto = new Bankkonto();

        konto.setNachname("Beutlin");
        konto.setVorname("Frodo");
        konto.setIban("DE5129050101007581946");
        konto.setLimit(1000.0);

        konto.einzahlen(500.0);
        konto.einzahlen(250.0);
        boolean erfolgreich = konto.auszahlen(1000.0);

        if (erfolgreich) {
            System.out.println("Auszahlung erfolgt!");
        }
        else {
            System.err.println("Betrag zu hoch!");
        }

        double kontostand = konto.getKontostand();
        System.out.printf("Kontostand: %,.2f €\n", konto.getKontostand());

        System.out.println(konto.getNachname());
    }
}
