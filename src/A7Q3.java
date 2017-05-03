
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void factors(int factors){
        //divide each number from 1 upto the number entered by user
        //find the factors of that number 
        for (int i = 1; i <= factors; i++) {
            if(factors % i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
      //create a scanner 
       Scanner input = new Scanner(System.in);
       
       //asking the user to enter a number 
        System.out.println("Enter a Number.");
        int num = input.nextInt();
        
        //print out the facotrs of the number 
        System.out.println("The Factors are: ");
        factors(num);
    }
}
