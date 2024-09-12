package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * Main
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class Main {
    public static void main(String[] args) {

        Display display = new Display(43.9, "1920 x 1080");
        HardDrive harddrive = new HardDrive("SSD", 512);
        Processor processor = new Processor("AMD Ryzen (7000 Series)", "4 x 2,80");
        Akku akku = new Akku(8.15,41);
        NoteBook notebook = new NoteBook(2.07, "NB185623", 16);

        // <=line=>
        System.out.print("\n===========================================\n");

        // Output NoteBook
        System.out.print(notebook.outputNoteBook());

        // <=line=>
        System.out.print("\n===========================================\n");

        // Output Display
        System.out.print(display.outputDisplay());

        // <=line=>
        System.out.print("\n===========================================\n");

        // Output Harddrive
        System.out.print(harddrive.outputHardDrive());

        // <=line=>
        System.out.print("\n===========================================\n");

        // Output Processor
        System.out.print(processor.outputProcessor());

        // <=line=>
        System.out.print("\n===========================================\n");

        // Output Akku
        System.out.print(akku.outputAkku());

        // <=line=>
        System.out.print("\n===========================================\n");
    }
}
