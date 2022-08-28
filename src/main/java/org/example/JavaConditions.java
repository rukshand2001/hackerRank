/*
Task
Given an integer,n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.

Input Format

A single line containing a positive integer,n.

Constraints
1<=n<=100
Output Format

Print Weird if the number is weird; otherwise, print Not Weird.
*/

package org.example;

import java.util.Scanner;

public class JavaConditions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int enterNumber = scanner.nextInt();

        if(enterNumber%2 == 1 ){
            System.out.println("Weird");
        } else if (enterNumber >= 2 && 5>= enterNumber){
            System.out.println("Not Weird");
        }else if(enterNumber>=6 && enterNumber<=20){
            System.out.println("Weird");
        } else if (enterNumber>20) {
            System.out.println("Not Weird");
        }
    }
}