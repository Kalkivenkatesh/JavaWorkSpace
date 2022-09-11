/*Write a program to print
        1 1 1 1
        2 2 2 2
        3 3 3 3
        4 4 4 4*/

package com.example.Assignments;
import java.util.Scanner;

public class ProbTwo {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
