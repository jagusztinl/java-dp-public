package templatemethod;

import java.util.stream.IntStream;

public abstract class PayDetails {

    public long yearlySalary() {
        return IntStream.rangeClosed(1, 12).mapToLong(i -> this.monthlySalary(i)).sum();
    }

    public abstract long monthlySalary(int month);
}
