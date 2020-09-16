
import java.util.Scanner;


public class Momentum {

  
    public static void main(String[] args) {
       
        double momentum, mass, velocity;
        
        Scanner s = new Scanner(System.in);
        
        //ask for mass and velocity
        System.out.print("Enter object's mass >>> ");
        mass = s.nextDouble();
        System.out.print("Enter object's velocity >>> ");
        velocity = s.nextDouble();
        
        momentum = mass * velocity;
        
        System.out.println(String.format("The object's momentum is %.2f",momentum));
        System.out.print("Program ened");
    }
    
}
