package aufgaben;

/**
 * A30_Methoden2
 * <p>
 *
 * @author Maximilian Stolle
 * @version 27.08.2024
 */
public class A30_Methoden2 {

    // Berechnet die Summe aus dem ganzen Array
     static int summeListe(int[] liste) {
        int x = 0;

         for (int i : liste) {
             x += i;
         }
         System.out.printf("Die Summe aller Werte im Array beträgt: %d\n",x);
         return x;
    }

    // Berechnet den kleinsten Wert im Array
    static int minWert(int[] liste) {
         int min = Integer.MAX_VALUE;

         for (int zahl : liste) {
             if (zahl < min) {
                 min = zahl;
             }
         }
        System.out.printf("Der kleinste Wert im Array ist: %d\n",min);
         return min;
    }

    // Berechnet den größten Wert im Array
    static int maxWert(int[] liste) {
         int max = Integer.MIN_VALUE;

         for (int zahl : liste) {
             if (zahl > max) {
                 max = zahl;
             }
         }
        System.out.printf("Der größte Wert im Array ist: %d\n",max);
         return max;
    }

    // Berechnet den Mittelwert im Array
    static int mittelWert(int[] liste) {
        int sum = 0;
        int counter = 0;

        for (int i : liste) {
            sum += i;
            counter++;
        }

        int wert = sum / counter;
        System.out.printf("Der Mittelwert im Array ist: %d\n",wert);
        return wert;
    }

    // Berechnet die Anzahl der Werte im Array
    static int anzahlWerte (int[] liste) {
         int counter = 0;
         for (int i = 0; i < liste.length; i++) {
             counter = i;
         }
        System.out.printf("Die Anzahl aller Werte im Array beträgt: %d\n",counter);
         return counter;
    }

    public static void main(String[] args) {

        int[] liste = {45, 0, -12, 75, 100, 27, 123, 89};

         int summe = summeListe(liste);
         int min = minWert(liste);
         int max = maxWert(liste);
         int wert = mittelWert(liste);
         int anzahl = anzahlWerte(liste);
    }
}
