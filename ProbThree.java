
/*
 * * * * * * * * * * * * * *
 * * * * * *   * * * * * * *
 * * * * *       * * * * * *
 * * * *           * * * * *
 * * *               * * * *
 * *                   * * *
 *                       * *
 *                         *
 *                         *
 *                         *
 *                         *
 *                         *
 *                         *
 * * * * * * * * * * * * * *
 */

package com.example.Assignments;
import java.util.Scanner;
public class ProbThree {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 || i==n-1 || j==0 || j==n-1 || (i==0 && j<=(n-1)/2) ||  (j==0 && i<(n-1)/2) || i+j<=(n-1)/2 || (i==0 && i==(n-1)/2 && j<n-1) || (j==n-1 && i<(n-1)/2) || j-i>=(n-1)/2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
