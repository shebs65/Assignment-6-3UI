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
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create new scanner for user input
        Scanner input = new Scanner(System.in);

        // create list of 2 integers
        System.out.println("Enter 2 integers:");
        int[] numbers = new int[2];

        // scan in numbers using for loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // output integers based on which one is greater
        if (numbers[1] > numbers[0]) {
            System.out.print("The numbers in ascending order are:" + numbers[0] + " " + numbers[1]);
        } else {
            System.out.println("The numbers in ascending order are:" + numbers[1] + " " + numbers[0]);
        }
    }
}
