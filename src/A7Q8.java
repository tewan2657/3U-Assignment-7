
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
     public static String season(int month, int day){
     //if dates lie between December 16 & March 15 - Winter
     if(month == 12 && day >=16 || month ==3 && day <=15 || month ==1 || month == 2){
        String num1 = "Winter.";
        
        //Return Winter if True
        return num1;
    }
     //if dates lie between March 16 & June 15 - Spring
    if(month == 3 && day >=16|| month == 6 && day <=15||month == 4 || month == 5){
        String num2 = "Spring.";
        
         //Return Spring if True
         return num2;       
         
    }
    //if dates lie between June 16 & September 15 - Summer
    if(month == 6 && day >=16 || month == 9 && day <=15 || month == 7 || month == 8){
        String num3 = "Summer.";
        
        //Return Summer if True
        return num3; 
        
    }
    //if dates lie between September 16 & December 15 - Fall 
    if(month == 9 && day >=16 || month == 12 && day <= 15 || month == 10 || month == 11){
        String num4 = "Fall.";
        
        // Return Fall if True 
        return num4;
        
    }
    //Return space if the if statements are false
        return " ";
    }
    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);
        
        //asking the user to input the month number 
        System.out.println("Input the Month Number.");
        int month = input.nextInt();
        
        //asking the user to input the day of the month 
        System.out.println("Input the Day of the Month.");
        int day = input.nextInt();
      
        
        System.out.println("The Season is:");
        
        //print the season according to the dateas given by the user 
          String num1 = season(month,day);
          System.out.println(num1);
          

        
    }
}
