package composite;

import java.util.List;

public class SalesTeam implements IPay {
    private List<IPay> payees;

    public SalesTeam(List<IPay> payees) {
        this.payees = payees;
    }

    @Override
    public void payExpenses(int amount) {
        this.payees.forEach(m -> m.payExpenses(amount));
    }
}
