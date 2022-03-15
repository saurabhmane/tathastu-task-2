//Write a java program to reverse the letter present in the given string;
package com.company;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s;
        String r ="";
        int n;
        System.out.println("\nEnter the String to reverse it ");
        s=sc.next();
        n = s.length();
        for (int i = n-1; i >=0; i--) {
            r = r+s.charAt(i);
        }
            System.out.println("the reversed string is ::"+r);

    }

}
