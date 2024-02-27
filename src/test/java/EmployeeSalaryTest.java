import com.service.EmployeeSalaryCalculator;
import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

public class EmployeeSalaryTest {

    private int countDay;

    public EmployeeSalaryTest(int countDay) {
        this.countDay = countDay;
    }
    @Test
    public void testCalculatorEmployeeSalary(){

        double expectedSalary = EmployeeSalaryCalculator.calculateEmployeeSalary(countDay);

        double actualSalary = EmployeeSalaryCalculator.calculateEmployeeSalary(countDay);

        Assertions.assertEquals(actualSalary ,expectedSalary);
    }
}
