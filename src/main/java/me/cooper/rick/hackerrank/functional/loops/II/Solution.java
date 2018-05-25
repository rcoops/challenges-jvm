package me.cooper.rick.hackerrank.functional.loops.II;

import java.util.List;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.round;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import static java.util.stream.IntStream.range;
import static java.util.stream.IntStream.rangeClosed;

class Solution {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        List<String> answers = range(0, t)
                .mapToObj(i -> {
                    int a = in.nextInt();
                    int b = in.nextInt();
                    int n = in.nextInt();
                    return rangeClosed(1, n)
                            .mapToObj(N -> String.valueOf(calculateSumForN(N, a, b)))
                            .collect(joining(", "));
                })
                .collect(toList());
        in.close();
        answers.forEach(System.out::println);
    }

    // 2^N * b
    private static int twoPowerNTimesB(int N, int b) {
        return (int) round(pow(2, N)) * b;
    }

    // a + 2^0 * b + 2^1 * b + ... + 2^n-1 * b
    private static int calculateSumForN(int n, int a, int b) {
        return a + range(0, n)
                .map(N -> twoPowerNTimesB(N, b))
                .sum();
    }

}
