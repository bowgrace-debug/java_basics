package sprachkern;

/**
 * Ternaerer Operator
 * <p>
 *
 *
 * @author Maximilian Stolle
 * @version 13.08.2024
 */
public class TernaererOperator {
    public static void main(String[] args) {

        /*
            Beispiel mit if
        */
        int gewicht = 8;
        double preis;
        if (gewicht <= 10) {
            preis = 5.0;
        }
        else {
            preis = 15.0;
        }

        /*
                Beispiele mit ternärem Operator ... ? ... : ...

                Syntax:
                    = bedingung ? wertWahr : wertUnwahr
        */
        preis = gewicht <= 10 ? 5.0 : 15.0;
        preis = (gewicht <= 10) ? 5.0 : 15.0; // Besser zu lesen
        preis = (((gewicht <= 10) ? 5.0 : 15.0) + 100);
        preis = (((gewicht <= 10) ? Math.sqrt(144.0) : 5.0 * 3.0)); //Wer hat denn so einen Scheiß geschrieben
    }
}
