package main;

import java.time.LocalDate;

public class Sonuc {
   
        public static  void main(String[] args) {
            Employee employee1 = new Employee("Fatih", 9000, 42, LocalDate.of(2022, 4, 2));

            Hesaplayici employeeManager = new Hesaplayici(employee1);
            employeeManager.calculateTax(employee1.getSalary());
            employeeManager.calculateBonus(employee1.getSalary(), employee1.getWorkHours());
            employeeManager.raiseSalary(employee1.getSalary(), employee1.getHireYear());

            System.out.println(employee1);

            Employee employee2 = new Employee("Yavuz", 8000, 36, LocalDate.of(2013, 12, 6));

            Hesaplayici employeeManager2 = new Hesaplayici(employee2);
            employeeManager2.calculateTax(employee2.getSalary());
            employeeManager2.calculateBonus(employee2.getSalary(), employee2.getWorkHours());
            employeeManager2.raiseSalary(employee2.getSalary(), employee2.getHireYear());

            System.out.println(employee2);

            Employee employee3 = new Employee("Zeynep", 10000, 50, LocalDate.of(2012, 9, 29));

            Hesaplayici employeeManager3 = new Hesaplayici(employee3);
            employeeManager3.calculateTax(employee3.getSalary());
            employeeManager3.calculateBonus(employee3.getSalary(), employee3.getWorkHours());
            employeeManager3.raiseSalary(employee3.getSalary(), employee3.getHireYear());

            System.out.println(employee3);
        }
    }


