package factorymethod;

public class HourlyPayDetails implements PayDetails {

    private double base;

    private int hours;

    public HourlyPayDetails(double base, int hours) {
        this.base = base;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return base * hours;
    }
}
