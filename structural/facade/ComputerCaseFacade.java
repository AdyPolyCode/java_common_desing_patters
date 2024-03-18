package facade;

public class ComputerCaseFacade {
    MotherBoard motherBoard;

    public ComputerCaseFacade(MotherBoard board) {
        this.motherBoard = board;
    }

    public void start() {
        motherBoard.startPowerOnSelfTest();
        motherBoard.run();
    }
}
