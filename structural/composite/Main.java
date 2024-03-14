package composite;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Manager manager1 = new Manager("Alpha");
        Manager manager2 = new Manager("Beta");
        SalesPerson person1 = new SalesPerson("Delta1", manager1);
        SalesPerson person2 = new SalesPerson("Delta2", manager1);
        SalesPerson person3 = new SalesPerson("Delta3", manager2);
        SalesPerson person4 = new SalesPerson("Delta4", manager2);

        SalesTeam team = new SalesTeam(List.of(manager1, manager2, person1, person2, person3, person4));

        pay(manager1, 2000);
        pay(manager2, 3000);

        pay(person1, 1200);
        pay(person2, 1300);
        pay(person3, 1400);
        pay(person4, 1500);

        pay(team, 2400);
    }

    private static void pay(IPay payee, int amount) {
        payee.payExpenses(amount);
    }
}
