
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
   public static int allDigitsOdd(int Num){
       if(Num == 0.2){
           System.out.println(Num);
       }
      
       
       
      while(Num>=10){
       Num = Num / 10;   
      }
      
       System.out.println(Num);
       
       return 0;
   } 
    
    
    
    
    public static void main(String[] args) {
        //create a Scanner 
        Scanner input = new Scanner(System.in);
        
        //asking the user to input a number
        System.out.println("Input a Number");
        
        int Num = input.nextInt();
     
        int Print = allDigitsOdd(Num);
    }
}
