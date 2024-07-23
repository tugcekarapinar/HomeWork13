package HomeWork5;

import java.util.Scanner;

public class RunExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Maaş Hesaplama Programı ===");

        System.out.print("Maaşınızı giriniz (TL):");
        double salary = scanner.nextDouble();
        System.out.print("Aylık çalıştığınız gün sayısını giriniz:");
        int day = scanner.nextInt();

        SalaryCalculation salaryCalculation = new SalaryCalculation();
        double totalSalary = salaryCalculation.CalculateSalary(day, salary);
        System.out.println("Bu ayki kazancınız:" + totalSalary + " TL");
    }
}