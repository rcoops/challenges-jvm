package me.cooper.rick.hackerrank.functional.endoffile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;
import static java.util.stream.IntStream.rangeClosed;

public class Solution {

    private static final Scanner SCANNER = new Scanner(in);
    private static final List<String> LINES = new ArrayList<>();

    public static void main(String[] args) {
        while (SCANNER.hasNextLine()) LINES.add(SCANNER.nextLine());

        rangeClosed(1, LINES.size()).forEach(Solution::printLineWithIndex);
    }

    private static void printLineWithIndex(int lineNumber) {
        out.println(lineNumber + " " + LINES.get(lineNumber - 1));
    }

}
