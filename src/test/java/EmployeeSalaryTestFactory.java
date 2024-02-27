import org.testng.annotations.Factory;

public class EmployeeSalaryTestFactory {
    @Factory
    public Object [] createInstance(){
        return new Object[] {
                new EmployeeSalaryTest(20),
                new EmployeeSalaryTest(30),
                new EmployeeSalaryTest(40),
                new EmployeeSalaryTest(50),
        };
    }
}
