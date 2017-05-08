
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A7Q8 {

    /**
     * @param args the command line arguments
     */
//    public static int season(int month, int day){
//     if(month >= 12 && month <=3 && day >=16){
//         System.out.println("Winter");
//     }
//     
//        
//        return 0;
//    }
//    
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);
        
        //asking the user to input the month number 
        System.out.println("Input the Month Number.");
        int month = input.nextInt();
        
        //asking the user to input the day of the month 
        System.out.println("Input the Day of the Month.");
        int day = input.nextInt();
        
        if(month >= 12 && month <=3 && day >=16){
         System.out.println("Winter");
        }
    }
}
