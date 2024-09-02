package aufgaben.a35_AutoVermietung;

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
        car.setModel("Mustang");
        car.setTagespauschaleCar();
        System.out.printf("Die gesamtkosten aus Mietdauer, gefahrene Kilometern und der Tagespauschale für den %s betragen: %,.2f €\n",car.getModel() ,car.gesamtpreisOne(423.0, 3));

        Car car2 = new Car();
        car2.setModel("Ente");
        car2.setTagespauschaleCar();
        System.out.printf("Die gesamtkosten aus Mietdauer, gefahrene Kilometern und der Tagespauschale für die %s betragen: %,.2f €\n", car2.getModel(), car2.gesamtpreisOne(423.0, 3));
    }
}
