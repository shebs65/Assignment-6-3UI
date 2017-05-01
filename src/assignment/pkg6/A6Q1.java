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
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner for user input
        Scanner input = new Scanner(System.in);

        // ask how many students are in the class, scan in that number
        System.out.println("How many students in the class?");
        int students = input.nextInt();

        // create list equal to number of students
        double[] marks = new double[students];

        // ask to input marks, then input them with a for loop
        System.out.println("Enter the marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }

        // for loop to calculate the sum
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        // calculate average, then output it
        double average = sum / marks.length;
        System.out.println("The class average is " + average + ".");

    }
}
