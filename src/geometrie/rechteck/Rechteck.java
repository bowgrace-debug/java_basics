package geometrie.rechteck;


/**
 * Rechteck
 * <p>
 *
 * @author Maximilian Stolle
 * @version 30.08.2024
 */
public class Rechteck {
    /*
        Instanzvariablen
     */
    private int seitenlaengeA;
    private int seitenlaengeB;

    /*
        Konstruktoren
        - Als Konstruktoren werden Methoden bezeichnet,
          die beim Erzeugen von Objekten aufgerufen werden.
        - tragen den Namen der Klasse
        - haben keinen Rückgabewert (auch nicht void!)
        - wenn kein eigener Konstruktor definiert wurde,
          wird automatisch ein Default- oder Standardkonstruktor
          eingefügt:
            public Rechteck() { // Signatur: Rechteck()
            }
        - Konstruktoren überladen
            - Konstruktoren können nur von anderen Konstruktoren aufgerufen werden
            - muss die erste Anweisung sein (Call to 'this()' must be first statement in constructor body)
            - es kann nur ein anderer Konstruktor aufgerufen werden
        - Verkettung von Konstruktoren
            - this() - Konstruktoraufruf in der gleichen Klasse
     */
    public Rechteck(int seitenlaengeA, int seitenlaengeB) {
        setSeitenlaengeA(seitenlaengeA);
        setSeitenlaengeB(seitenlaengeB);
    }

    public Rechteck() {

    }
    /*
        Destruktoren
        - Als Destruktoren werden spezielle Methoden bezeichnet,
          die beim Auflösen von Objekten aufgerufen werden.
        - gibt es in Java nicht wirklich
        - wird durch die Methode finalize repräsentiert
            protected void finalize() {
            }
        - seit Java 9 deprecated
        - wird einmal oder keinmal aufgerufen
     */
//    protected void finalize() {
//    }

    /*
        Methoden
     */
    public int umfang() {
        return 2 * seitenlaengeA + 2 * seitenlaengeB;
    }

    public int flaeche() {
        return seitenlaengeA * seitenlaengeB;
    }

    /*
        Setter
     */
    public void setSeitenlaengeA(int seitenlaengeA) {
        if (seitenlaengeA > 0) {
            this.seitenlaengeA = seitenlaengeA;
        }
        else {
            throw new IllegalArgumentException("Seitenlänge muss größer 0 sein! Du Honk!");
        }
    }

    // Überladen der Methode setSeitenlaengeA
    public void setSeitenlaengeA(double seitenlaengeA) {
        setSeitenlaengeA((int) seitenlaengeA);
    }

    // Überladen der Methode setSeitenlaengeA
    public void setSeitenlaengeA(String seitenlaengeA) {
        setSeitenlaengeA(Integer.parseInt(seitenlaengeA));
    }

    public void setSeitenlaengeB(int seitenlaengeB) {
        this.seitenlaengeB = seitenlaengeB;
    }

    /*
        Getter
     */
    public int getSeitenlaengeA() {
        return seitenlaengeA;
    }

    public int getSeitenlaengeB() {
        return seitenlaengeB;
    }

}