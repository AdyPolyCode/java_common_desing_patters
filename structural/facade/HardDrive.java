package facade;

public class HardDrive implements IComponent {
    private void readData() {
        System.out.println("Reading data from disk");
    }

    private void writeData() {
        System.out.println("Writing data to disk");
    }

    @Override
    public void run() {
        readData();
        writeData();
    }
}
