package HomeWork5Test;

import HomeWork5.SalaryCalculation;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SalaryCalculationTest {

    @Test
    public void testCalculateSalary() {
        int day = 23;
        double salary = 45000;
        double expected = 41400;
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double totalSalary = salaryCalculation.CalculateSalary(day, salary);
        Assert.assertEquals(totalSalary, expected, "Salary calculation failed for salary=" + salary + " and days=" + day);
    }

    @DataProvider (name= "SalaryData")
    public Object[][] salaryData(){
        return new Object[][] {
                { 2500.0, 20, 2000.0 },
                { 3000.0, 25, 3000.0 },
                { 5000.0, 30, 10000.0 },
                { 2000.0, 15, 1300.0 },
                { 1000.0, 35, 11000.0 }
        };
    }

    @Test (dataProvider = "SalaryData")
    public void testCalculateSalaryUseDataProvider(double salary, int day, double expected) {
        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double totalSalary = salaryCalculation.CalculateSalary(day, salary);
        Assert.assertEquals(totalSalary, expected, "Salary calculation failed for salary=" + salary + " and days=" + day);
    }
}