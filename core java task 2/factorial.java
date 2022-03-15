//Write a java program to calculate factorial of given number;
package com.company;

import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,fact=1;
        System.out.println("\n Enter the number to claculate factorial ");
        a= sc.nextInt();
        if (a==0){
            System.out.println("\factorial is ::"+fact);
        }else{
        for (int i=1;i<=a;i++){
            fact=fact*i;
        }
        System.out.println("\n factorial of given number is ::"+fact);
          }
    }
}
