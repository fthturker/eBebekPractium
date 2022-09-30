package main;

import java.time.LocalDate;

public class Hesaplayici implements Servic{

        Employee employee;

        public Hesaplayici(Employee employee) {
            this.employee = employee;
        }

        @Override
        public void calculateTax(double salary) {
            employee.setSalary(salary - (salary * 0.03));
        }

        @Override
        public void calculateBonus(double salary, int workHour) {
            if(workHour > 40) {
                for(int i = 0; i < workHour - 40; i++) {
                    salary += 30;
                }
                employee.setSalary(salary);

            }
        }

        @Override
        public void raiseSalary(double salary, LocalDate hireYear) {
            if (2021 - hireYear.getYear() < 10) {
                employee.setSalary(salary + salary * 0.05);
            } else if (2021 - hireYear.getYear() > 9 && 2021 - hireYear.getYear() < 20) {
                employee.setSalary(salary + salary * 0.10);
            } else {
                employee.setSalary(salary + salary * 0.15);
            }
        }
    }

