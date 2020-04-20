package bridge;

public class HourlyBonus implements Bonus {

    private int hours;

    public HourlyBonus(int hours) {
        this.hours = hours;
    }

    @Override
    public double pay() {
        if (hours > 100) {
            return 50;
        }
        else {
            return 0;
        }
    }
}
