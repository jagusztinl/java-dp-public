package templatemethod;

public class HourlyPayDetails extends PayDetails {

    private long base;

    private long[] hours;

    public HourlyPayDetails(long base, long[] hours) {
        this.base = base;
        this.hours = hours;
    }

    @Override
    public long monthlySalary(int month) {
        return hours[month - 1] * base;
    }
}
