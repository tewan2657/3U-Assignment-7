
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A7Q6 {

    /**
     * @param args the command line arguments
     */
    // public static int LastDigit(int N){
    //} 
    public static int lastDigit(int Num){
        //find the last digit by finding the remainder of the number 
        int answer = Num % 10;
        return answer;
    }
    
    
    
    public static void main(String[] args) {
        // create a scanner 
        Scanner input = new Scanner(System.in);

        //asking the user to input a number 
        System.out.println("Input a Number.");
      int Num = input.nextInt();
      
      //space
        System.out.println("");

      //print out the answer
        System.out.println("The Last Digit of the Number is:");
        
       int answer = lastDigit(Num);
        System.out.println(answer);



    }
}
