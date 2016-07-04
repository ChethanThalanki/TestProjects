package com.chethan.testProjects;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by i322682 on 04/07/16.
 */
public class Fact {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();
        BigInteger a = new BigInteger(n);
        BigInteger b = new BigInteger(m);
        System.out.println(fact(a).mod(b));
    }

    public static BigInteger fact(BigInteger a){

        if(a.compareTo(BigInteger.ONE)>=1)
            return a.multiply(fact(a.subtract(BigInteger.ONE)));
        return a;
    }
    //23 14567
}
