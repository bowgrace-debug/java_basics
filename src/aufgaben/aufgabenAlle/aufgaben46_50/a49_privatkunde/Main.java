package aufgaben.aufgabenAlle.aufgaben46_50.a49_privatkunde;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 10.09.2024
 */
public class Main {
    public static void main(String[] args) {

        KundenKontoInformation konto = new KundenKontoInformation(
                "DE51290501010081994675", "SBREDE22XXX");
        KundenAdresse adresse = new KundenAdresse(
                "Musterstrasse 1", 12345, "Musterhausen");
        KundenInformationen kundeOne = new KundenInformationen
                ("Max", "Stolle", "01.01.2000", adresse, konto);

        System.out.print(kundeOne.ausgabeInfo());
        System.out.print(kundeOne.ausgabeTrennlinie());
        System.out.print(kundeOne.getKonto().ausgabeKonto());
        System.out.print(kundeOne.ausgabeTrennlinie());
        System.out.print(kundeOne.getAdresse().ausgabeAdresse());
        System.out.print(kundeOne.ausgabeTrennlinie());
    }
}
