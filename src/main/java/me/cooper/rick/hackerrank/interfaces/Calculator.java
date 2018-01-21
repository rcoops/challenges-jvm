package me.cooper.rick.hackerrank.interfaces;

import static java.lang.Math.sqrt;
import static java.util.Arrays.stream;
import static java.util.stream.IntStream.*;

public class Calculator implements AdvancedArithmetic {

    @Override
    public int divisorSum(int n) {
        int[] divisors = findDivisors(n);
        return stream(divisors).sum();
    }

    private int[] findDivisors(int n) {
        return concat(of(n), rangeClosed(1, (int) sqrt(n) + 1)
                .filter(i -> n % i == 0)
                .distinct())
                .toArray();
//        List<Integer> divisors = new ArrayList<>(n);
//        for (int i = 1; i < sqrt(n); i++) {
//            if (n % i == 0) {
//                divisors.add(i);
//            } else if (n / i != i) {
//                divisors.add(n / i);
//            }
//        }
//        return divisors.stream().mapToInt(Integer::intValue).toArray();
    }

}
