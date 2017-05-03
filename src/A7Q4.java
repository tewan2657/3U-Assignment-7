
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A7Q4 {

    /**
     * @param args the command line arguments
     */
    public static double compoundInterest(double P, double R, int N){
        //R plus 1, to the power of N 
        double squared = Math.pow((1 + R), N);
        
        //P x sqaured ^
        double balance = P*squared;
        
        //send back an answer        
        return balance;
    }
    
    
    
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        //asking the user to input the Intial Principle 
        System.out.println("What is the Intial Principle?");
        double P = input.nextDouble();
        
        //asking the user to input the Interest Rate
        System.out.println("What is the Interest Rate?");
        double R = input.nextDouble();
        
        //asking the user to input the number of years
        System.out.println("Number of Years.");
        int N = input.nextInt();
        
        //Print out the balance 
        System.out.println("Your Balance: ");
        
        double balance = compoundInterest(P, R, N);
        System.out.println(balance);
        
        
    }
}
