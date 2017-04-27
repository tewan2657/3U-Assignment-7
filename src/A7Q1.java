
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
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in); 
        
        //asking the user to enter the radius  
        System.out.println("What is the Radius?");
        double rad = input.nextDouble();
        
        //find the area of circle - 3.14(r)^2
        double circleArea = (Math.pow(2,rad))* 3.14;
        System.out.println(circleArea);
    }
}
