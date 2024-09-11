package aufgaben.aufgabenAlle.aufgaben50_100.a51_GartenmaschinenAlt;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Main {
    public static void main(String[] args) {

        // Stromgenerator
        TecDetails m12953_1 = new TecDetails(
                196, "Normalbenzin bleifrei", "4-Takt", 4.5, "Mannesmann M12953 Stromgenerator");
        ConstructionMachine m12953_2 = new ConstructionMachine(
                3000, 42);
        Mass m12953_3 = new Mass(610,430,435);

        System.out.print(m12953_1.outputTecDetails());
        System.out.print(m12953_2.outputConstructionMachine());
        System.out.print(m12953_3.outputMass());
        System.out.print(m12953_1.outputline());


        // Rasenmäher
        TecDetails powerEdition53QRA_1 = new TecDetails(
                190, "Normalbenzin bleifrei", "4-Takt", 4.4, "WOLF GARTEN Benzin-Rasenmäher Power-Edition 53 QRA");

        GardenMachine powerEdition53QRA_2  =new GardenMachine(
                53, 65,96);

        System.out.print(powerEdition53QRA_1.outputTecDetails());
        System.out.print(powerEdition53QRA_2.outputGardenMachine());
        System.out.print(powerEdition53QRA_1.outputline());
    }
}
