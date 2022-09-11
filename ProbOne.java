package com.example.Assignments;
import java.util.Scanner;

public class ProbOne { //1.Write a program(WAP) to print INEURON using pattern programming logic.
    public static void main(String args[])
    {
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter n Value: ");
        int n = obj.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-2;j++)
            {
                if(  (j==(n-2)/2) || i==0 || i==n-1)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");

            for(int j=0;j<n;j++)
            {
                if(j==0 || j==n-1 || i==j)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.print("  ");
            for(int j=0;j<n-2;j++)
            {
                if(j==0 || i==0 || i==n-1 || (i==(n-1)/2 && j<=(n-2)/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            for(int j=0;j<n-1;j++)
            {
                if(i==n-1 || j==0 || j==n-2)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            for(int j=0;j<(n+1)/2;j++)
            {
                if(j==0 || (i==0 && j<n/2) || (i==(n-1)/2 && j<n/2) || (i-j==(n-1)/2 ) || (j==(n)/2 && i<(n-1)/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");
            for(int j=0;j<n;j++)
            {
                if((i==0 && j!=0 && j!=n-1)  || (j==0 && i!=0 && i!=n-1)  || (i==n-1 && j!=0 && j!=n-1)|| (j==n-1 && i!=0 && i!=n-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.print("  ");

            for(int j=0;j<n;j++)
            {
                if(j==0 || j==n-1 || i==j)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }

            System.out.println("");
        }
    }
}
