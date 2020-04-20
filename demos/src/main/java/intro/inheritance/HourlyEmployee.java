package intro.inheritance;

public class HourlyEmployee extends Employee {

    private double baseAmount;

    private int hours;

    public HourlyEmployee(String name, double baseAmount, int hours) {
        super(name);
        this.baseAmount = baseAmount;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return baseAmount * hours;
    }

    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}
