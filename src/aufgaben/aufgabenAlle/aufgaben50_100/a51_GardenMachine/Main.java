package aufgaben.aufgabenAlle.aufgaben50_100.a51_GardenMachine;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Main {
    public static void main(String[] args) {

        // Stormgenerator
        Motor strom_1 = new Motor(196,"4-Takt","Normalbezin bleifrei", 5.4);
        PowerGenerator strom_2 = new PowerGenerator(42,3000, "Mannesmann M12953 Stromgenerator");
        Mass strom_3 = new Mass(610,430,435);

        System.out.println("Stromgenerator:");
        System.out.print(strom_1.outputMotor());
        System.out.print(strom_2.outputPower());
        System.out.print(strom_3.outputMass());
        System.out.print(strom_1.outputLine());

        // Rasenmäher

        Motor mowing_1 = new Motor(190,"4-Takt", "Normalbenzin bleifrei", 4.4);
        MowingMachine mowing_2 = new MowingMachine(53,65,mowing_1,96, "WOLF GARTEN Benzin-Rasenmäher Power-Edition 53 QRA");

        System.out.println("Rasenmäher:");
        System.out.print(mowing_1.outputMotor());
        System.out.print(mowing_2.outputMowing());
    }
}
