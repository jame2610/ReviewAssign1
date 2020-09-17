package part1;

import TurtleGraphics.*;
import java.awt.Color;
import static java.awt.Color.red;
import java.util.Scanner;

public class BarChart {

    static SketchPadWindow spw = new SketchPadWindow(600, 600);
   static Pen p = new StandardPen(spw);

    public static void main(String[] args) {
        int value1, value2, value3, value4;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter value 1 of 4 >>> ");
        value1 = s.nextInt();
        System.out.print("Enter value 2 of 4 >>> ");
        value2 = s.nextInt();
        System.out.print("Enter value 3 of 4 >>> ");
        value3 = s.nextInt();
        System.out.print("Enter value 4 of 4 >>> ");
        value4 = s.nextInt();
        
        makebar(-150,0,value1,Color.red);
        makebar(-50,0,value2,Color.orange);
        makebar(50,0,value3,Color.blue);
        makebar(150,0,value4,Color.yellow);
        Line(-150,0);
    }

public static void Line (int xloc, int yloc){

    p.up();
    p.move(xloc,yloc);
    p.down();
    p.setColor(Color.BLACK);
    p.setDirection(0);
    p.setWidth(9);
    p.move(300);
    

    
}

public static void makebar( int xloc, int yloc, int length, Color col){
   
    p.up();
    p.move(xloc, yloc);
    p.down();
    p.setColor(col);
    p.setDirection(90);
    p.move(length);
    p.down();
    p.drawString(length + "");
    p.setWidth(5);
    
    
  
    
    }
  

     
}
