package part1;

import .*;
import TurtleGraphics.*;
import java.awt.Color;
import static java.awt.Color.red;
import java.util.Scanner;

public class BarChart {

          SketchPadWindow spw = new SketchPadWindow(600,600);
  Pen p = new StandardPen(spw);   
          
  
    public static void main(String[] args) {
        double value1, value2, value3, value4;
        
        Scanner s = new Scanner(System.in); 
         
         System.out.print("Enter value 1 of 4 >>> ");
        value1 = s.nextDouble();
        System.out.print("Enter value 2 of 4 >>> ");
        value2 = s.nextDouble();
        System.out.print("Enter value 3 of 4 >>> ");
        value3 = s.nextDouble();
        System.out.print("Enter value 4 of 4 >>> ");
        value4 = s.nextDouble();
        
      
        
    }
    
     

}
    
    
    
    public static void makebar(Pen p, int xloc, int yloc, int length, Color col){
   
    p.up();
    p.move(xloc, yloc);
    p.down();
    p.setColor(col);
    p.setDirection(90);
    p.move(length);
    p.down();
    p.drawString(length + "");
    
  
    
    }
   public static void line(int x, int y){}

     
}
