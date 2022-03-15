//Write a java program to check the whether the given array is mirror inverse or not


import java.util.Scanner;

public class arr {

    static boolean MirrorInv(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {

                if (arr[arr[i]] != i)
                return false;
        }

        return true;
    }


    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter the sizeof array ");
        n=sc.nextInt();
        System.out.println("\nEnter the  array element ");
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();

        }
        if (MirrorInv(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}