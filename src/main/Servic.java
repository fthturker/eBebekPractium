package main;

import java.time.LocalDate;

public interface Servic {
    // console ui da kullandığımız için void döndürdüp console'a çıktı verdik yoksa double döndürmeyi tercih ederdim.
    void calculateTax(double salary);
    void calculateBonus(double salary, int workHour);
    void raiseSalary(double salary, LocalDate hireYear);
}
