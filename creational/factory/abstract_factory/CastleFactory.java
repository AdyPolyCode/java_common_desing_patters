package factory.abstract_factory;

public abstract class CastleFactory {
    public abstract Gate createGate();

    public abstract Wall createWall();

    public abstract Tower createTower();
}