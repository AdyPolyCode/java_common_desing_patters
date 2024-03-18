package facade;

public class Main {
    public static void main(String[] args) {
        ComputerCaseFacade facade = new ComputerCaseFacade(
                new MotherBoard(
                        new CentralProcessingUnit(),
                        new GraphicalProcessingUnit(),
                        new HardDrive(),
                        new RandomAccessMemory()
                )
        );

        facade.start();
    }
}
