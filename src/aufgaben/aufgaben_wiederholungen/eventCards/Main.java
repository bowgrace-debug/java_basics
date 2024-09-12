package aufgaben.aufgaben_wiederholungen.eventCards;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 11.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Eventcard[] cards = new Eventcard[5];

        // <=line=>
        System.out.print("===========================================");

        // Open Air Dance Night (Event)
        cards[0] = new Eventcard(
                "Open Air Dance Night", "28.08.2024", "06.00", "20,00 €", "18", 5.0);
        System.out.print(cards[0].outputEventCard());

        // <=line=>
        System.out.print("===========================================");

        // Trash (Event)
        cards[1] = new Eventcard(
                "Trash", "28.08.2024", "06:00", "50,00 €", "18",1.0);
        System.out.print(cards[1].outputEventCard());

        // <=line=>
        System.out.print("===========================================");

        // Summer Love (Event)
        cards[2] = new Eventcard(
                "Summer Love", "09.09.2024","11.00", "100,00 €", "18", 4.9);
        System.out.print(cards[2].outputEventCard());

        // <=line=>
        System.out.print("===========================================");
    }
}