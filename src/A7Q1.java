
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    public static double circleArea (double radius){
    //calculate area of circle 
       double square = Math.pow(radius, 2);
       double area = Math.PI*square;
       //send back the answer 
       return area;
    
    }
    
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        //asking the user to enter the radius  
        System.out.println("What is the Radius?");
        double rad = input.nextDouble();
        
        //Giving the answer to the user 
        double answer = circleArea(rad);
        System.out.println(answer);
    }
}
