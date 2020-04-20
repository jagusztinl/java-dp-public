package templatemethod;

public class MonthlyPayDetails extends PayDetails {

    private long salary;

    public MonthlyPayDetails(long salary) {
        this.salary = salary;
    }

    @Override
    public long monthlySalary(int month) {
        return salary;
    }
}
