package factory;

import factory.factory_method.Candy;
import factory.factory_method.CandyFactory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Candy candy = CandyFactory.getCandy(CandyFactory.CANDY_TYPE.PEPPERMINT);
        System.out.println(candy);

        List<Candy> candies = CandyFactory.generateQuantityOf(10, CandyFactory.CANDY_TYPE.LOLLIPOP);
        System.out.println(candies);
    }
}
