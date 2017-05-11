
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
    public static void chaotic(int Num) {

        for (int i = 0; i < Num; i++) {
            //random Equation
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            //print Asterisks
            for (int j = 0; j < randNum; j++) {
                System.out.print("*");
            }
            //space
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //create a scanner 
        Scanner input = new Scanner(System.in);
        System.out.println("Input a Number");
        int N = input.nextInt();
        
        //space 
        System.out.println("");
        
        //print
        chaotic(N);
    }
}
