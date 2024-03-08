package factory.abstract_factory;

public class GiantCastleFactory extends CastleFactory {
    @Override
    public Gate createGate() {
        return new GiantGate();
    }

    @Override
    public Wall createWall() {
        return new GiantWall();
    }

    @Override
    public Tower createTower() {
        return new GiantTower();
    }
}