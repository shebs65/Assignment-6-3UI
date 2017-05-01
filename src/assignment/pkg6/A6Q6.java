/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg6;

import java.util.Scanner;

/**
 *
 * @author shebm3906
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many students are in the class?");
        int students = input.nextInt();
        
        System.out.println("Input " + students + " marks:");
        int[] marks = new int[students];
        
        for (int i = 0; i < marks.length; i++) {
        marks[i] = input.nextInt();
        }

        for (int i = 0; i < marks.length; i++) {
            for (int x = 1; x < marks.length; x++) {
                if (marks[x - 1] > marks[x]) {
                   int temp = marks[x - 1];
                    marks[x - 1] = marks[x];
                    marks[x] = temp;
                }
            }
        }
    
        System.out.println("The lowest mark is " + marks[0] + ".");
        
        int highestMrk = marks.length - 1;
        
        System.out.println("The highest mark is " + marks[highestMrk] + ".");
    
        double average = 0;
        for (int i = 0; i < marks.length; i++) {
           average = average + marks[i];
        }
        average = average / marks.length;
        
        System.out.println("The average is " + average + ".");
    }
}
