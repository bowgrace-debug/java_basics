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

        NotebookCharacteristics notebookCharacteristics = new NotebookCharacteristics(2.07,"NB185623",16);
        Display display = new Display(43.9,"1920 x 1080");
        ComputerComponents computerComponents = new ComputerComponents(notebookCharacteristics, display);

        Akku akku = new Akku(8.15, 41);
        HardDrive hardDrive = new HardDrive("SSD", 512);
        Processor processor = new Processor("AMD Ryzen 5 (7000 Series)", "4 x 2,80");
        Hardware hardware = new Hardware(akku, hardDrive, processor);

        Notebook notebook = new Notebook(hardware, computerComponents);

        System.out.print(notebook.outputline());
        System.out.println("\nNotebook:");
        System.out.print(notebook.outputNotebook());
        System.out.print(notebook.outputline());
    }
}