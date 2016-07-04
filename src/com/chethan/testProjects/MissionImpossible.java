package com.chethan.testProjects;

import java.util.Scanner;

/**
 * Created by i322682 on 01/07/16.
 */
public class MissionImpossible {
    public static void main(String args[] ) throws Exception {
        /*Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        int m = scanner.nextInt();

        long nSum = 1L;
        //System.out.println(Integer.MAX_VALUE);
        //List<Integer> nList = new ArrayList<Integer>();
        int[] nArr = new int[n+1];
        //List<Integer> qList = new ArrayList<Integer>();
        int[] qArr = new int[q+1];
        //System.out.println("input");
        for(int i=1; i <= n; i++){
            nArr[i] =  scanner.nextInt();
            nSum *= nArr[i];
        }
        for(int i=1; i <= q; i++){
            qArr[i] = scanner.nextInt() ;
        }
        *//*Iterator<Long> iter = qList.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }*//*
        for(int i=1;i<=q;i++){
            System.out.println(nSum/nArr[qArr[i]]%m);
        }*/
        /*Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> strList = new ArrayList<String>();
        for(int i =0;i<n ; i++){

            StringBuilder sb = new StringBuilder();
            sb.append(scanner.next().toString());
            strList.add(sb.reverse().toString());
        }
        for(int i =0;i<n ; i++){
            System.out.println(strList.get(i));
        }*/
        /*Scanner scanner =  new Scanner(System.in);
        int n = scanner.nextInt();
        List<String> strList = new ArrayList<String>();
        for(int i =0;i<n ; i++){
            strList.add(scanner.next());
        }
        for(int i =0;i<n ; i++){
            String str = new String();
            for(int j=0;j<((String)strList.get(i)).length();j++){
                Character c = ((String)strList.get(i)).charAt(j);
                if(j==0){
                    str +=c;
                }else if(((String)strList.get(i)).charAt(j) != ((String)strList.get(i)).charAt(j-1)){
                    str +=c;
                }
                if(j==((String)strList.get(i)).length()-1){
                    System.out.println(str);
                }
            }
        }*/


        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String[] output = new String[t];
        /*int[][] nArr = new int[n][];
        int[] qArr = new int[];
        List<String> strList = new ArrayList<String>();
        for(int i =0;i<t ; i++){
            strList.add(scanner.next());
        }*/
        for (int k = 0; k < t; k++) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int[][] nArr = new int[t][n];
            for (int i = 0; i < n; i++) {
                nArr[k][i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                int sum = 0;
                boolean disp = true;
                for (int j = i; j < n; j++) {
                    if (j == i) {
                        sum = 0;
                    }
                    if (sum < x) {
                        sum += nArr[k][j];
                    }
                    if (sum == x) {
                        output[k]="YES";
                        disp = false;
                        break;
                    }
                }
                if (!disp) break;
                else if (i == n - 1) {
                    output[k]="NO";
                }
            }
        }
        for (int k = 0; k < t; k++) {
            System.out.println(output[k]);
        }
    }
}
