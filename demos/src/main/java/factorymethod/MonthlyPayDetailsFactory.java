package factorymethod;

public class MonthlyPayDetailsFactory implements PayDetailsFactory {

    @Override
    public PayDetails create() {
        return new MonthlyPayDetails(0);
    }
}
