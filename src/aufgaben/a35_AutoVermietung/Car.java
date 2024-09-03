package aufgaben.a35_AutoVermietung;

/**
 * Car
 * <p>
 *
 * @author Maximilian Stolle
 * @version 02.09.2024
 */
public class Car {

    private double tagespauschaleCar;
    private double gefahreneKilometer;
    private double mieteInTagen;
    private String model;
    final double FREIEKILOMETER = 150.0;

    public double gesamtpreis(double gefahreneKilometer, double FREIEKILOMETER,double tagespauschaleCar, double mieteInTagen) {
        double gesamtpreis = tagespauschaleCar * mieteInTagen;
        if (gefahreneKilometer > 150) {
            gesamtpreis += ((gefahreneKilometer - FREIEKILOMETER) * 0.60);
        }
        return gesamtpreis;
    }
    public void setMieteInTagen(double mieteInTagen) {
        this.mieteInTagen = mieteInTagen;
    }
    public double getMieteInTagen() {
        return mieteInTagen;
    }

    public void setTagespauschaleCar(double tagespauschaleCar) {
        if (model.equalsIgnoreCase("Ford Mustang V8 Cabrio 1965")) {
            tagespauschaleCar = 270.0;
        } else {
            tagespauschaleCar = 225.0;
        }
    }

    public double getTagespauschaleCar(double tagespauschaleCar) {
        return tagespauschaleCar;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setGefahreneKilometer(double gefahreneKilometer) {
        this.gefahreneKilometer = gefahreneKilometer;
    }

    public double getGefahreneKilometer() {
        return gefahreneKilometer;
    }
}
