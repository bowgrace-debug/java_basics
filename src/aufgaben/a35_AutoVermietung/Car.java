package aufgaben.a35_AutoVermietung;

/**
 * Car
 * <p>
 *
 * @author Maximilian Stolle
 * @version 02.09.2024
 */
public class Car {

    double tagespauschaleCar;
    double gefahreneKilometer;
    double mieteInTagen;
    String model;
    final double freieKilometer = 150.0;

    public double gesamtpreisOne(double gefahreneKilometer, double mieteInTagen) {
        double gesamtpreis = tagespauschaleCar * mieteInTagen;
        if (gefahreneKilometer > 150) {
            gesamtpreis += ((gefahreneKilometer - freieKilometer) * 0.60);
        }
        return gesamtpreis;
    }

    public void setTagespauschaleCar() {
        if (model.equalsIgnoreCase("Mustang")) {
            tagespauschaleCar = 270.0;
        } else {
            tagespauschaleCar = 225.0;
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
