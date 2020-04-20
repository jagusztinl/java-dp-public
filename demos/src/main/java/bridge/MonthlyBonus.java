package bridge;

public class MonthlyBonus implements Bonus {

    private double amount;

    public MonthlyBonus(double amount) {
        this.amount = amount;
    }

    @Override
    public double pay() {
        return amount;
    }
}
