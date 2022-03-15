//Write a java program to transpose of a given matrix.
import java.util.Scanner;

public class transpose
{
    public static void main(String args[])
    {
        int i, j;
        System.out.println("Enter the  total number of rows and columns: ");
        Scanner s = new Scanner(System.in);
        int row = s.nextInt();
        int col = s.nextInt();
        int arr[][] = new int[row][col];
        System.out.println("Enter matrix:");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                arr[i][j] = s.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("The above matrix before Transpose is ");
        for(i = 0; i < row; i++)
        {
            for(j = 0; j < col; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("The given matrix after Transpose is ");
        for(i = 0; i < col; i++)
        {
            for(j = 0; j < row; j++)
            {
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
