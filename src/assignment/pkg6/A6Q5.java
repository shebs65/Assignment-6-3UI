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
public class A6Q5 {

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

        int median = 0;
        int medianOne = 0;
        int medianTwo = 0;
        // int medianEven = 0;

        if (students % 2 == 1) {
            median = students / 2;
            System.out.println("The median mark is " + marks[median]);
        }
        if (students % 2 == 0) {
            medianOne = students / 2;
            medianTwo = medianOne - 1;
            median = (marks[medianOne] + marks[medianTwo]) / 2;
            System.out.println(median);
        }

    }
}
