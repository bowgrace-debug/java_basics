package privatkunde;

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

        System.out.printf("Name: %s %s, geboren am: %s\n",
                kundeOne.getVorname(), kundeOne.getNachname(), kundeOne.getGeburtstag());
        System.out.println("=========================================");
        System.out.printf("IBAN: %s\nBIC: %s \n",
                kundeOne.getKonto().getIban(), kundeOne.getKonto().getBic());
        System.out.println("=========================================");
        System.out.printf("Adresse:\n%s\n%d %s\n",
                kundeOne.getAdresse().getStrasse(), kundeOne.getAdresse().getPlz(), kundeOne.getAdresse().getOrt());
        System.out.println("=========================================");
    }
}
