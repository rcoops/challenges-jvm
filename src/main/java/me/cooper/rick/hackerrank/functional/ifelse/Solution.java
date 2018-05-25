package me.cooper.rick.hackerrank.functional.ifelse;

import java.util.*;
import java.util.function.*;

public class Solution {

    // Obviously overboard here... better to do a function as below
    private static final Predicate<Integer> isWeird = n -> n % 2 == 1 || n > 5 && n < 21;

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();
        // Predicate
        System.out.println((isWeird.test(N) ? "" : "Not ") + "Weird");

        // function
//        System.out.println((isWeird(N) ? "" : "Not ") + "Weird");
    }

//    private static boolean isWeird(int n) {
//        return n % 2 == 1 || n > 5 && n < 21;
//    }

}
