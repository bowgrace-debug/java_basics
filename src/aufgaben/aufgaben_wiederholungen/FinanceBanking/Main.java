package aufgaben.aufgaben_wiederholungen.FinanceBanking;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 06.09.2024
 */
public class Main {
    public static void main(String[] args) {

//        FinanceBanking konto = new FinanceBanking();

        FinanceBanking[] konten = new FinanceBanking[5];
        konten[0] = new FinanceBanking("Maxmilian", "Stolle", "DE51290501010081994675", 1049.74);
        konten[1] = new FinanceBanking("Hans", "Meyer", "DE61290501010081631823", 15243.82);
        konten[2] = new FinanceBanking("Jack", "Jones", "DE61290501010081631823", 15243.82);
        konten[3] = new FinanceBanking("Johanna", "Kirchbach", "DE61290501010081631823", 15243.82);
        konten[4] = new FinanceBanking("Kira", "Titanwolf", "DE61290501010081631823", 15243.82);

//        System.out.println(konten[0].getVorname(),konten[0].getNachname(), konten[0].getiBAN());
        System.out.println(konten[0].getKontostand());
    }
}
