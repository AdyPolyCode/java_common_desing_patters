package factory.abstract_factory;

public class GiantTower implements Tower {
    @Override
    public String getDescription() {
        return "Tower type of: " + this.getClass().getSimpleName();
    }
}