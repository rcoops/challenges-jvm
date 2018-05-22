package me.cooper.rick.hackerrank.bitwiseand;

import java.util.*;
import java.util.stream.IntStream;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<Integer> answers = new ArrayList<>();
        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            answers.add(maxBitwiseAnd(n, k));

        }
        for (Integer answer : answers) System.out.println(answer);
        scanner.close();
    }

    private static int maxBitwiseAnd(int n, int k)
    {
        // rangeclosed only does progressive ranges so need to reverse it with the map
        int[] NtoOne = IntStream.rangeClosed(1, n).map(it -> n - it + 1).toArray();
        return IntStream.of(NtoOne)
                .map(N -> IntStream.of(NtoOne) // do 2 loops
                        .filter(it -> it < N && (it & N) < k) // filter out the possibilities that don't match criteria
                        .map(it -> it & N) // map it to the answers we want (bit wasteful doing twice but ?)
                        .max() // get the max
                        .orElse(0)) // unwrap any optional
                .max()
                .orElse(0); // same thing
    }
}
