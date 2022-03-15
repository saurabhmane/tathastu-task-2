//Write a java program to check palindrome string;
package com.company;

import java.util.Scanner;

public class pal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        String r ="";
        int n;
        System.out.println("\nEnter the String to check palindrome or not ");
        s=sc.next();
        n = s.length();
        for (int i = n-1; i >=0; i--) {
            r = r+s.charAt(i);
        }
        if (s.equals(r)) {
            System.out.println("Given String is Palindrome");
        }
        else {
            System.out.println("Not palindrome");
        }
    }

}
