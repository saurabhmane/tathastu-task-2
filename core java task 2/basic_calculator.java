//Write a java program to perform basic calculator operations.

package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a, b, c, d,ch;
        Scanner Sc= new Scanner(System.in);
        System.out.println("\n Enter ur choice 1) for Sum\n2)For Subtraction \n3) For Multiplication\n4) For Division\n");
        ch=Sc.nextInt();
        System.out.println("\n Enter first value");
        a = Sc.nextInt();
        System.out.println("\n Enter second value");
        b = Sc.nextInt();
        switch (ch) {
            case 1:c = a + b;
                System.out.println("Sum of given number is ::" + c);
                break;
            case 2:c = a - b;
                System.out.println("Substraction of given number is ::" + c);
                break;
            case 3:c = a * b;
                System.out.println("Multiplication of given number is ::" + c);
                break;
            case 4:c = a/b;
                System.out.println("Division of given number is ::" + c);
                break;
            default:System.out.println("\nWrong choice ");
        }



    }
}
