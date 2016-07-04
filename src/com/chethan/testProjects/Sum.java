package com.chethan.testProjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sum {
    public static void main (String[] args){

        //System.out.println("Enter the number of testCases: ");
        Scanner scanner =  new Scanner(System.in);
        int testCasesCount = scanner.nextInt();
        //System.out.println(Integer.MAX_VALUE);
        List<Integer> intList = new ArrayList<Integer>();
        //System.out.println("input");
        for(int i=0; i < testCasesCount*2; i++){
            intList.add(scanner.nextInt());
        }
        //System.out.println("output");
        for(int i=0; i < testCasesCount*2; i+=2){
            System.out.println(intList.get(i)+intList.get(i+1));
        }
    }
}
