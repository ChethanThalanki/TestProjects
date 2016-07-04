package com.chethan.testProjects;

import java.util.Scanner;

/**
 * Created by i322682 on 04/07/16.
 */
public class BusGossip {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int[][] route = new int[t][3];
        long[] summation = new long[t];
        for (int i = 0; i < t; i++) {
            int sum =0;
            for (int j = 0; j < 3; j++) {
                route[i][j] = scanner.nextInt();
                sum+=route[i][j];
            }
            summation[i]=sum;
        }
        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(route[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Time : " + lcm(summation));

    }

    private static long lcm(long a, long b)
    {
        return a * (b / gcd(a, b));
    }

    private static long lcm(long[] input)
    {
        long result = input[0];
        for(int i = 1; i < input.length; i++) result = lcm(result, input[i]);
        return result;
    }

    private static long gcd(long a, long b)
    {
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        return a;
    }
}
