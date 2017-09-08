package me.cooper.rick.hackerrank.scope;

import java.util.Arrays;

import static java.lang.Math.*;

/**
 * Created by rcooper on 20/08/2017.
 */
public class Difference {

    private int[] elements;
    public int maximumDifference;

    Difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        maximumDifference = getMaxDifference(0, 0, elements);
    }

    private int getMaxDifference(int maxSoFar, int maxFromLastIteration, int[] remaining) {
        int maxOverall = max(maxSoFar, maxFromLastIteration);
        if(remaining.length == 1) {
            return maxOverall;
        }
        int[] tail = Arrays.stream(remaining).skip(1).toArray();
        return getMaxDifference(maxOverall, getMaxFromCurrentIteration(remaining[0], tail), tail);
    }

    private int getMaxFromCurrentIteration(int head, int[] tail) {
        return Arrays.stream(tail).reduce(0, (previous, current) -> max(abs(current - head), previous));
    }

}
