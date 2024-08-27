package aufgaben;

/**
 * A25_Klassenspiegel
 * <p>
 *
 * @author Maximilian Stolle
 * @version 22.08.2024
 */
public class A25_Klassenspiegel {
    public static void main(String[] args) {

        int[] ergebnisse = {92, 80, 29, 81, 100, 66, 91, 50, 70, 82, 30, 85, 96, 67};

        int[] klassenspiegel = new int[6];

        int note = 0;
        for (int ergebnis : ergebnisse) {
            if (ergebnis >= 92) {
                note = 1;
            }
            else {
                if (ergebnis >= 81) {
                    note = 2;
                }
                else {
                    if (ergebnis >= 67) {
                        note = 3;
                    }
                    else {
                        if (ergebnis >= 50) {
                            note = 4;
                        }
                        else {
                            if (ergebnis >= 30) {
                                note = 5;
                            }
                            else {
                                note = 6;
                            }
                        }
                    }
                }
            }
            klassenspiegel[note - 1]++;
        }

        // Ausgabe
        System.out.println("Note   |  1 |  2 |  3 |  4 |  5 |  6 |");
        System.out.println("-------+----+----+----+----+----+----+");
        System.out.print("Anzahl |");
        for (int anzahl : klassenspiegel) {
            System.out.printf("%3d |", anzahl);
        }
        System.out.println();

        // Zusatzaufgabe: Klassenschnitt
        int summe = 0;
        for (int ergebnis : ergebnisse) {
            summe += ergebnis;
        }
        int klassenschnitt = summe / ergebnisse.length;
        System.out.printf("%nKlassenschnitt: %d%%%n", klassenschnitt);

        // Exkurs: Ausgabe "Box-drawing"
        String ausgabe = "";
        ausgabe = "┌───────┬────┬────┬────┬────┬────┬────┐\n";
        ausgabe += "│Note   │";
        for (int i = 1; i <= 6; i++) {
            ausgabe += String.format("%3d │", i);
        }
        ausgabe += "\n├───────┼────┼────┼────┼────┼────┼────┤\n";
        ausgabe += "│Anzahl │";
        for (int anzahl : klassenspiegel) {
            ausgabe += String.format("%3d │", anzahl);
        }
        ausgabe += "\n";
        ausgabe += "└───────┴────┴────┴────┴────┴────┴────┘";
        System.out.println(ausgabe);
    }
}
