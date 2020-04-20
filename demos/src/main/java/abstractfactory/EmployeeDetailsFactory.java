package abstractfactory;

public interface EmployeeDetailsFactory {

    PayDetails createPayDetails();

    Bonus createBonus();
}
