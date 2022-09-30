package main;

import java.time.LocalDate;

public class Sonuc {
   
        public static  void main(String[] args) {
            Employee employee1 = new Employee("Burak", 7500, 30, LocalDate.of(2022, 1, 1));

            Hesaplayici employeeManager = new Hesaplayici(employee1);
            employeeManager.calculateTax(employee1.getSalary());
            employeeManager.calculateBonus(employee1.getSalary(), employee1.getWorkHours());
            employeeManager.raiseSalary(employee1.getSalary(), employee1.getHireYear());

            System.out.println(employee1);

            Employee employee2 = new Employee("Torukobyte", 7500, 40, LocalDate.of(2011, 1, 1));

            Hesaplayici employeeManager2 = new Hesaplayici(employee2);
            employeeManager2.calculateTax(employee2.getSalary());
            employeeManager2.calculateBonus(employee2.getSalary(), employee2.getWorkHours());
            employeeManager2.raiseSalary(employee2.getSalary(), employee2.getHireYear());

            System.out.println(employee2);

            Employee employee3 = new Employee("Tbyte", 7500, 50, LocalDate.of(2000, 1, 1));

            Hesaplayici employeeManager3 = new Hesaplayici(employee3);
            employeeManager3.calculateTax(employee3.getSalary());
            employeeManager3.calculateBonus(employee3.getSalary(), employee3.getWorkHours());
            employeeManager3.raiseSalary(employee3.getSalary(), employee3.getHireYear());

            System.out.println(employee3);
        }
    }


