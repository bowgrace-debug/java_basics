package aufgaben.aufgabenAlle.aufgaben50_100.a52_Tragbar;

/**
 * Hardware
 * <p>
 *
 * @author Maximilian Stolle
 * @version 12.09.2024
 */
public class Hardware {

    // local variable
    private Akku akku;
    private HardDrive hardDrive;
    private Processor processor;

    // Constructor
    public Hardware(Akku akku, HardDrive hardDrive, Processor processor) {
        this.akku = akku;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    // Getter & Setter
    public Akku getAkku() {
        return akku;
    }
    public void setAkku(Akku akku) {
        this.akku = akku;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }
    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }
    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    // Output
    public String outputHardware(){
        return akku.outputAkku() + hardDrive.outputHardDrive() + processor.outputProcessor();
    }
}
