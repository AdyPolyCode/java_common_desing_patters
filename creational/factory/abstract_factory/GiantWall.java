package factory.abstract_factory;

public class GiantWall implements Wall {
    @Override
    public String getDescription() {
        return "Wall type of: " + this.getClass().getSimpleName();
    }
}