
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void examGrade(int examGrade) {
        //if grade is less than 50 - F
        if (examGrade < 50) {
            System.out.println("F");
            
        } //if grade between 50 & 60 - D
        else if (examGrade >= 50 && examGrade < 60) {
            System.out.println("D");
            
        } //if grade between 60 & 70
        else if (examGrade >= 60 && examGrade < 70) {
            System.out.println("C");
            
        } //if grade between 70 & 80 - B 
        else if (examGrade >= 70 && examGrade < 80) {
            System.out.println("B");
            
        } //if grade is not between 0 & 80 - A
        else {
            System.out.println("A");
        }

    }

    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);
        
        //asking the user to input exam grade
        System.out.println("Input the Exam Grade. ");
         int Grade = input.nextInt();
        
         examGrade(Grade);
    }
}
