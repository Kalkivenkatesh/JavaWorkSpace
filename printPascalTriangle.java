package com.assignmentone;

import java.util.Scanner;

public class printPascalTriangle {
    private static long[][] memory;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of lines of Pascal Triangle:  ");
        int nLines = sc.nextInt();
        PascalTriangle(nLines);
    }
    public static void PascalTriangle(int nLines){
        memory = new long[nLines][nLines];
        for (int i = 0; i < nLines; i++) {
            for (int k = 0; k < nLines - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                long Element = calculateElement(i, j);
                System.out.print(Element + " ");
            }
            System.out.println();
        }
    }

    public static long calculateElement(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        if (memory[n][k] != 0) {
            return memory[n][k];
        }
        memory[n][k] = calculateElement(n - 1, k - 1) + calculateElement(n - 1, k);
        return memory[n][k];
    }
}