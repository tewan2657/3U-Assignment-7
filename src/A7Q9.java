
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A7Q9 {

    /**
     * @param args the command line arguments
     */
   public static boolean allDigitsOdd(int Num){
    while(Num > 0){
       //find last digit 
        int lastDigit = Num % 10;
        //if the remainder of the last digit is 0 - Even 
        if(lastDigit % 2 == 0){
            return false;
        }
        //if the remainder of the last digit is not 0 - odd 
        //continue to the next digit in the number
        Num = Num /10;
    }
       return true;
   } 
    
    
    
    
    public static void main(String[] args) {
        //create a Scanner 
        Scanner input = new Scanner(System.in);
        
        //asking the user to input a number
        System.out.println("Input a Number");
        int Num = input.nextInt();
     
        //Print
        boolean Print = allDigitsOdd(Num);
        if(Print == true){
            System.out.println("True");    
        }
        else{
            System.out.println("False");
        }
    }
}
