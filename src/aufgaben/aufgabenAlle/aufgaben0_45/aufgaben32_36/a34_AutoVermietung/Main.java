package aufgaben.aufgabenAlle.aufgaben0_45.aufgaben32_36.a34_AutoVermietung;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 02.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setModel("Ford Mustang V8 Cabrio 1965");
        car.setTagespauschaleCar(270);
        car.setMieteInTagen(3);
        car.setGefahreneKilometer(423);
        System.out.printf(
                "Die gesamtkosten aus %.1f Tage(n) Mietdauer,\n" +
                "gefahrenen %.2f Kilometern und der Tagespauschale für den %s (%,.2f €) betragen: %,.2f €\n",
                car.getMieteInTagen(),car.getGefahreneKilometer(),car.getModel(), car.getTagespauschaleCar(270), car.gesamtpreis(423.0,150, 270, 3));

        Car car2 = new Car();
        car2.setModel("Charleston Ente 1986");
        car2.setTagespauschaleCar(225);
        car2.setMieteInTagen(3);
        car2.setGefahreneKilometer(423);
        System.out.printf(
                "Die gesamtkosten aus %.1f Tage(n) Mietdauer,\n" +
                "gefahrenen %.2f Kilometern und der Tagespauschale für die %s (%,.2f €) betragen: %,.2f €\n",
                car2.getMieteInTagen(), car2.getGefahreneKilometer(),car2.getModel(),car2.getTagespauschaleCar(225), car2.gesamtpreis(423.0, 150, 225, 3));
    }
}
