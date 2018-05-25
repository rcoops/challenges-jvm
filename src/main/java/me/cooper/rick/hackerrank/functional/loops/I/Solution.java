package me.cooper.rick.hackerrank.functional.loops.I;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        // Range practice
        IntStream.rangeClosed(1, 10)
                .forEach(i -> System.out.println(N + " x " + i + " = " + N * i));

        // Classical style
        //for (int i = 1; i <= 10; ++i) System.out.println(N + " x " + i + " = " + N * i);
    }

}
