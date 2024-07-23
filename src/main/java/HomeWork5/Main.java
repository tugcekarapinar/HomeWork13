package HomeWork5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Maaş Hesaplama Programı ===");

        System.out.print("Maaşınızı giriniz (TL):");
        double salary = scanner.nextDouble();
        System.out.print("Aylık çalıştığınız gün sayısını giriniz:");
        int day = scanner.nextInt();

        double totalSalary = day<=25 ? CalculateSalary(day,salary) : CalculateSalaryWithPrime(day,salary);
        System.out.println("Bu ayki kazancınız:" + totalSalary + " TL");
    }

    public static double CalculateSalary(int day, double salary) {
        double dailySalary = salary / 25;
        return dailySalary * day;
    }

    public static double CalculateSalaryWithPrime(int day, double salary) {
        double extraDay = day-25;
        return salary + (extraDay * 1000);
    }
}