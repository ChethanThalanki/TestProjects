package com.chethan.testProjects;

import java.util.Scanner;

public class Driver {

    public static void main (String[] args){

        //System.out.println("Enter the number of testCases: ");
        Scanner scanner =  new Scanner(System.in);
        int testCasesCount = scanner.nextInt();
        int[] inputArr = new int[testCasesCount];
        //System.out.println("input");
        for(int i=0; i < testCasesCount; i++){
            inputArr[i]=scanner.nextInt();
        }
        //System.out.println("output");
        for(int i=0; i < testCasesCount; i++){
            //System.out.println(inputArr[i]);
            int value = inputArr[i];
            for(int j=1;j<=value;j++) {
                if (j % 3 == 0 && j % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (j % 3 == 0) {
                    System.out.println("Fizz");
                } else if (j % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(j);
                }
            }
        }
    }
}
