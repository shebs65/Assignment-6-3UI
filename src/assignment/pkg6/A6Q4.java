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
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new scanner
        Scanner input = new Scanner(System.in);

        // ask user to enter 10 marks, scan them in in an array
        System.out.println("Enter 10 marks:");
        int[] marks = new int[10];
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextInt();
        }

        // sort numbers into ascending ordwer
    //    for (int i = 1; i < marks.length; i++) {
      //  }
        int temp = 0;

        for (int i = 0; i < marks.length; i++) {
            for (int x = 1; x < marks.length; x++) {
                if (marks[x - 1] > marks[x]) {
                    temp = marks[x - 1];
                    marks[x - 1] = marks[x];
                    marks[x] = temp;
                }
            }
        }
               
        // print sorted array
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }



    }
}
    
