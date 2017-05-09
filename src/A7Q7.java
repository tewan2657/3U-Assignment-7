
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A7Q7 {

    /**
     * @param args the command line arguments
     */
    public static int firstDigit(int Num){
        //Look through each number until num < 10 which will be the first digit  
        while(Num>=10){
        Num = Num / 10;
    }
   // Print out the first digit of the number entered by the user  
        System.out.println("The First Digit is: ");
        System.out.println(Num);
        return Num;
    }
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        
        //asking the user to input a number 
        System.out.println("Input a Number.");
        int Num = Math.abs(input.nextInt());
        
        System.out.println("");
        
        
        int Print = firstDigit(Num);
        
       
        
    }
}
