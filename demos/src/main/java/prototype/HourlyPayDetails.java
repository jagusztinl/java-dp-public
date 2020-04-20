package prototype;

public class HourlyPayDetails implements PayDetails {

    private double base;

    private int hours;

    public HourlyPayDetails(double base, int hours) {
        this.base = base;
        this.hours = hours;
    }

    public HourlyPayDetails(HourlyPayDetails other) {
        this.base = other.base;
        this.hours = other.hours;
    }

    @Override
    public double pay() {
        return base * hours;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getBase() {
        return base;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
