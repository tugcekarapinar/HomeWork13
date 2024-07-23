package HomeWork5;

public class SalaryCalculation {

    public double CalculateSalary(int day, double salary) {
         return day <= 25 ? CalculateSalaryNoPrime(day, salary) : CalculateSalaryWithPrime(day, salary);
    }

    private double CalculateSalaryNoPrime(int day, double salary) {
        double dailySalary = salary / 25;
        return dailySalary * day;
    }

    private double CalculateSalaryWithPrime(int day, double salary) {
        double extraDay = day - 25;
        return salary + (extraDay * 1000);
    }
}