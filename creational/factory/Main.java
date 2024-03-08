package factory;

import factory.abstract_factory.*;
import factory.factory_method.Candy;
import factory.factory_method.CandyFactory;

import java.util.List;

import static factory.abstract_factory.AbstractCastleFactory.CASTLE_TYPE.GIANT_CASTLE;

public class Main {
    public static void main(String[] args) {
        // Factory method
        Candy candy = CandyFactory.getCandy(CandyFactory.CANDY_TYPE.PEPPERMINT);
        System.out.println(candy);

        List<Candy> candies = CandyFactory.generateQuantityOf(10, CandyFactory.CANDY_TYPE.LOLLIPOP);
        System.out.println(candies);

        // Abstract factory
        buildCastleFromAbstractFactory();
    }

    private static void buildCastleFromAbstractFactory() {
        CastleFactory factory = AbstractCastleFactory.getCastle(GIANT_CASTLE);
        Gate gate1 = factory.createGate();
        System.out.println("Gate1 " + gate1.getDescription() + " was created");
        Gate gate2 = factory.createGate();
        System.out.println("Gate2 " + gate2.getDescription() + " was created");
        Wall wall1 = factory.createWall();
        System.out.println("Wall1 " + wall1.getDescription() + " was created");
        Wall wall2 = factory.createWall();
        System.out.println("Wall2 " + wall2.getDescription() + " was created");
        Tower tower1 = factory.createTower();
        System.out.println("Tower1 " + tower1.getDescription() + " was created");
        Tower tower2 = factory.createTower();
        System.out.println("Tower2 " + tower2.getDescription() + " was created");
    }
}
