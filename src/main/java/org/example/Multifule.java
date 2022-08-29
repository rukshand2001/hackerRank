package org.example;

import java.util.Scanner;

public class Multifule {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter yoour number: ");
        int enteredNumber = scanner.nextInt();

        for (int i = 0 ;i<10;i++){
            int multiflyingResult = enteredNumber*(i+1);
            System.out.println(enteredNumber+" * "+(i+1)+" = "+multiflyingResult);
        }

    }
}
