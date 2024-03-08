package factory.abstract_factory;

public class GiantGate implements Gate {
    @Override
    public String getDescription() {
        return "Gate type of: " + this.getClass().getSimpleName();
    }
}