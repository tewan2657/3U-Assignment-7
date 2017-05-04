
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void chaotic(int N, int A){
        
        int randNum = (int)(Math.random()*(N - A + 1 )) + A;
        System.out.println(randNum);
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);
        
        //asking the user to input a number for N
        System.out.println("Input a Number for N ");
        int N = input.nextInt();
        
        //asking the user to input a number for A
        System.out.println("Input a Number for A");
        int A = input.nextInt();
        
        chaotic(N, A);
    }
}
