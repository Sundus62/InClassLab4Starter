package edu.cscc;
import java.util.Arrays;
// Exercise06_02.java: Enter 5 integers and
// display the numbers in reverse order
public class Main {
    public static void main (String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        //Create array with a length of 5
        int[] num = new int[5];
        //Prompt the user for 5 integers

        //Use a For Loop to read the five Integers

        //Sort the Array


        // Display the array in Reverse Order
        //Display the array in order
        System.out.println("The array output in order");


        System.out.println();

        System.out.println("The array output in reverse order");

        for (int i = num.length-1; i >= 0; i--) {
            System.out.print(num[i]);
            System.out.println();
        }

    }
}
