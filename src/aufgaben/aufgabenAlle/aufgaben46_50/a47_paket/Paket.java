package aufgaben.aufgabenAlle.aufgaben46_50.a47_paket;

/**
 * Paket
 * <p>
 *
 * @author Maximilian Stolle
 * @version 06.09.2024
 */
public class Paket {
    private double gewicht;

    public Paket() {

    }

    public Paket(double gewicht) {
        // Variante 1
        this.gewicht = gewicht;
        // Variante 2
        setGewicht(gewicht);
    }

    public double berechnePreis() {
        double preis = 7.0;
        if (gewicht > 5.0 && gewicht <= 10) {
            preis = 10.5;
        }
        else {
            if (gewicht > 10.0) {
                preis = 14.0;
            }
        }
        return preis;
    }

    public String asString() {
        return String.format("%.2f kg = %.2f €", gewicht, berechnePreis());
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGewicht(String gewicht) {
        switch (gewicht) {
            case "siebzehn":
                this.gewicht = 17.0;
                break;
        }
    }

    public double getGewicht() {
        return gewicht;
    }


}
