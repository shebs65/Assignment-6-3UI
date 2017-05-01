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
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner for user input
        Scanner input = new Scanner(System.in);

        // scan in number of people in survey
        System.out.println("How many people are in the survey?");
        int people = input.nextInt();

        // create list of heights equal to number of people
        double[] heights = new double[people];


        // ask user to enter heights, then scan them in using a for loop
        System.out.println("Please enter the heights");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }

        // calculate sum using a for loop
        double sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }

        // calculate average
        double average = sum / heights.length;

        // output heights above average using for loop
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > average) {
                System.out.print(heights[i] + ", ");

            }
        }
    }
}
