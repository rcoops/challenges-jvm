package me.cooper.rick.hackerrank.scope;

import java.util.Scanner;

/**
 * Created by rcooper on 20/08/2017.
 */
public class Solution {

    private Solution() {}

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            sc.close();

            Difference difference = new Difference(a);

            difference.computeDifference();

            System.out.print(difference.maximumDifference);
        }
    }
}
