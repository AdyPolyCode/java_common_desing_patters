package facade;

public class CentralProcessingUnit implements IComponent {
    private void fetch() {
        System.out.println("Fetching instruction");
    }

    private void execute() {
        System.out.println("Executing instruction");
    }

    @Override
    public void run() {
        fetch();
        execute();
    }
}
