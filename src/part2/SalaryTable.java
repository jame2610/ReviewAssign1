
package part2;

import java.text.NumberFormat;


public class SalaryTable {

   
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getNumberInstance();
        int salary = 40000;
        int ras;
        System.out.format("%5s", "YEAR");
        System.out.format("%20s", "OLD SALARY");
        System.out.format("%15s", "RAISE");
        System.out.format("%20s\n", "NEWSALARY");
        
         System.out.format("%5s", "====");
        System.out.format("%20s", "==========");
        System.out.format("%15s", "=====");
        System.out.format("%20s\n", "=========");
    
        for (int year = 2020; year < 2030; year++) {
            System.out.format("%5d", year);
            System.out.format ("%20s", nf.format(salary));
            ras = (int)(0.03* salary);
            System.out.format("%15s", nf.format(ras));
            salary+= ras;
            System.out.format("%20s\n", nf.format(salary));
        }
    }
    
}