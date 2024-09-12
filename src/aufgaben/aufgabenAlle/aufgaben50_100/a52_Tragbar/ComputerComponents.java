package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * ComputerComponents
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class ComputerComponents {

    // local variable
    private NotebookCharacteristics notebookCharacteristics;
    private Display display;

    // Constructor
    public ComputerComponents(NotebookCharacteristics notebookCharacteristics, Display display) {
        this.notebookCharacteristics = notebookCharacteristics;
        this.display = display;
    }

    // Getter & Setter
    public NotebookCharacteristics getNotebookCharacteristics() {
        return notebookCharacteristics;
    }
    public void setNotebookCharacteristics(NotebookCharacteristics notebookCharacteristics) {
        this.notebookCharacteristics = notebookCharacteristics;
    }

    public Display getDisplay() {
        return display;
    }
    public void setDisplay(Display display) {
        this.display = display;
    }

    // Output
    public String outputComputerComponents(){
        return notebookCharacteristics.outputNotebookCharacteristics() + display.outputDisplay();
    }
}
