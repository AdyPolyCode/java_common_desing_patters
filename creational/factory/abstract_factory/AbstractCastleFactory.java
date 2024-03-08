package factory.abstract_factory;

public class AbstractCastleFactory {
    public enum CASTLE_TYPE {
        GIANT_CASTLE,
        // ...
    }

    public static CastleFactory getCastle(CASTLE_TYPE type) {
        switch (type) {
            case GIANT_CASTLE: return new GiantCastleFactory();
            default: return null;
        }
    }
}
