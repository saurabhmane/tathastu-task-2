// java program for Permutation & Combination  
package com.company;

import java.util.Scanner;

public class percom {
    public  static int fact(int n)
    {
        int fac = 1,i=1;
        while (i<=n){
            fac*=i;
            i++;
        }
        return fac;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int perm = fact(n)/fact(n-r);
        int comb = fact(n)/(fact(n-r)*fact(r));
        System.out.println("Permutation = " + perm);
        System.out.println("Combination = " + comb);
    }
}
