package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * Notebook
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class Notebook {

    // local variable
    private Hardware hardware;
    private ComputerComponents computerComponents;

    // Constructor
    public Notebook(Hardware hardware, ComputerComponents computerComponents) {
        this.hardware = hardware;
        this.computerComponents = computerComponents;
    }

    // Getter & Setter
    public Hardware getHardware() {
        return hardware;
    }
    public void setHardware(Hardware hardware) {
        this.hardware = hardware;
    }

    public ComputerComponents getComputerComponents() {
        return computerComponents;
    }
    public void setComputerComponents(ComputerComponents computerComponents) {
        this.computerComponents = computerComponents;
    }

    // Output
    public String outputNotebook(){
        return hardware.outputHardware() + computerComponents.outputComputerComponents();
    }
}
