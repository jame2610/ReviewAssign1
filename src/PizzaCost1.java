
import static java.lang.System.out;
import java.util.Scanner;


public class PizzaCost1 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double labour = 1.5;
        double heat =0.75;
        double tops = 0.75;
        double inchp = 0.50 * tops;
        double  pizza;
        
        System.out.print("Enter Pizza inches >>> ");
        inchp = s.nextDouble();
        System.out.print("Enter how many toppings on Pizza >>> ");
        tops = s.nextDouble();
        
        inchp = inchp *0.50;
        tops = 0.50 * tops;
        pizza = heat + labour + tops + inchp;
        
        System.out.println(String.format("The pizza cost:  $%.2f",pizza));
        
        
    }
    
}
