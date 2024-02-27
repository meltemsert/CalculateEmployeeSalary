import com.service.EmployeeSalaryCalculator;
import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EmployeeSalaryCalculatorTest {
    @Test
    public void testCalculatorEmployeeSalary(){
        int countDay = 20;
        double expectedSalary = 20000.0;

        double actualSalary = EmployeeSalaryCalculator.calculateEmployeeSalary(countDay);

        Assertions.assertEquals(expectedSalary, actualSalary);
    }
    @DataProvider (name = "salaryData")
    public Object [][] salaryData(){
        return new Object [][]{
                {20,1000,20000.0},
                {30,1000,35000.0},
                {40,1000,55000.0},
                {50,1000,75000.0}
        };
    }
    @Test(dataProvider = "salaryData")
    public void testCalculatorEmployeeSalary(int countDay,
                                             double dailySalary,
                                             double expectedExactSalary){
        double actualSalary= EmployeeSalaryCalculator.calculateEmployeeSalary(countDay);

        Assertions.assertEquals(actualSalary, expectedExactSalary);





    }





}
