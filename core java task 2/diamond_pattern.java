//Write a java program to print diamond pattern;
package com.company;


    import java.util.Scanner;
    public class dia
    {
        public static void main(String args[])
        {
            int n, i, j, sp = 1;
            System.out.print("\nEnter the number of rows to form diamond: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            sp = n - 1;
            for (j = 1; j <= n; j++)
            {
                for (i = 1; i <= sp; i++)
                {
                    System.out.print(" ");
                }
                sp--;
                for (i = 1; i <= 2 * j - 1; i++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
            sp = 1;
            for (j = 1; j <= n - 1; j++)
            {
                for (i = 1; i <= sp; i++)
                {
                    System.out.print(" ");
                }
                sp++;
                for (i = 1; i <= 2 * (n - j) - 1; i++)
                {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }
    }



