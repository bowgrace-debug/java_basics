package aufgaben;

import java.util.Scanner;

/**
 * A31_KlassenspiegelProzedural
 * <p>
 *
 * @author Maximilian Stolle
 * @version 28.08.2024
 */
public class A31_KlassenspiegelProzedural {

    static double eingabeProzentzahl () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie Ihre erreichte Prozentzahl ein: ");
        return scanner.nextDouble();
    }


    // Berechnet die Note anhand der Eingabe (Prozentzahl)
    static int berechnungNoten (String[] bewertung, int[] ergebnisse, double prozentzahl) {
        int note = 0;

        if (prozentzahl >= 92) {
            note = 1;
        }
        else {
            if (prozentzahl >= 81 && prozentzahl <= 91) {
                note = 2;
            }
            else {
                if (prozentzahl >= 67 && prozentzahl <= 80) {
                    note = 3;
                }
                else {
                    if (prozentzahl >= 50 && prozentzahl <= 66) {
                        note = 4;
                    }
                    else {
                        if (prozentzahl >= 30 && prozentzahl <= 49) {
                            note = 5;
                        }
                        else {
                            note = 6;
                        }
                    }
                }
            }
        }
        System.out.printf("Anhand deiner Prozentzahl hast du folgende Note erreicht: %d!\n", note);
        return note;
    }


    // Berechnet die Bewertung anhand der Eingabe (Prozentzahl)
    static String berechnungBewertung (String[] bewertung, int[] ergebnisse, double prozentzahl) {
        String wertung = "";

            if (prozentzahl >= 92) {
                wertung = bewertung[0];
            }
            else {
                if (prozentzahl >= 81 && prozentzahl <= 91) {
                    wertung = bewertung[1];
                }
                else {
                    if (prozentzahl >= 67 && prozentzahl <= 80) {
                        wertung = bewertung[2];
                    }
                    else {
                        if (prozentzahl >= 50 && prozentzahl <= 66) {
                            wertung = bewertung[3];
                        }
                        else {
                            if (prozentzahl >= 30 && prozentzahl <= 49) {
                                wertung = bewertung[4];
                            }
                            else {
                                wertung = bewertung[5];
                            }
                        }
                    }
                }
            }
        System.out.printf("Anhand deiner Prozentzahl hast du folgende Bewertung erreicht: %s!\n", wertung);
        return wertung;
    }

    // Berechnet sowohl die Note, als auch die Bewertung anhand der Eingabe (Prozentzahl)
    static int notenUndBewertungBerechnung (int[] ergebnisse, String[] bewertung, double prozentzahl) {
        int note = 0;
        String wertung = "";

        if (prozentzahl >= 92) {
            note = 1;
            wertung = bewertung[0];
        }
        else {
            if (prozentzahl >= 81 && prozentzahl <= 91) {
                note = 2;
                wertung = bewertung[1];

            }
            else {
                if (prozentzahl >= 67 && prozentzahl <= 80) {
                    note = 3;
                    wertung = bewertung[2];
                } else {
                    if (prozentzahl >= 50 && prozentzahl <= 66) {
                        note = 4;
                        wertung = bewertung[3];
                    }
                    else {
                        if (prozentzahl >= 30 && prozentzahl <= 49) {
                            note = 5;
                            wertung = bewertung[4];
                        }
                        else {
                            note = 6;
                            wertung = bewertung[5];
                        }
                    }
                }
            }
        }
        System.out.printf("Anhand der erreichenden Prozentzahl von: %.1f %%,\nhaben Sie die Note: %d erreicht.\nDas entspricht der Bewertung: %s!\n",prozentzahl, note, wertung );
        return note;
    }


    public static void main(String[] args) {

        int[] ergebnisse = {92, 81, 67, 50, 30, 0};
        String[] bewertung = {"sehr gut", "gut", "befriedigend", "ausreichend", "mangelhaft", "ungenügend"};

        double prozentzahl = eingabeProzentzahl();
        System.out.println("=============================================");

        System.out.println("Aufgabe 1: \n");
        int note = berechnungNoten(bewertung, ergebnisse, prozentzahl);
        System.out.println("=============================================");

        System.out.println("Aufgabe 2: \n");
        String wertung = berechnungBewertung(bewertung, ergebnisse, prozentzahl);
        System.out.println("=============================================");

        System.out.println("Aufgabe 1 und 2 zusammen: \n");
        int gesamteBewertung = notenUndBewertungBerechnung(ergebnisse, bewertung, prozentzahl);


    }
}