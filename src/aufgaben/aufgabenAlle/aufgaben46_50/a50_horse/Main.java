package aufgaben.aufgabenAlle.aufgaben46_50.a50_horse;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Sattel sattel = new Sattel(
                "genarbtes Nubukleder", 3.5, "F");
        Horse horse = new Horse(
                "Bhalou", "Irish Sport Horse", "Dunkelfuchs",
                "Wallach", 167.0,8, sattel);
        Halfter halfter = new Halfter("F");

        System.out.print(horse.ausgabeHorse());
        System.out.print(horse.ausgabeTrennlinie());
        System.out.print(sattel.ausgabeSattel());
        System.out.print(horse.ausgabeTrennlinie());
        System.out.print(halfter.ausgabeHalfter());
        System.out.print(horse.ausgabeTrennlinie());
    }
}
