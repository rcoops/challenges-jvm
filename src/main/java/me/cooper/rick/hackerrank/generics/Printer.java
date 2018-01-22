package me.cooper.rick.hackerrank.generics;

import java.util.Arrays;

public class Printer<T> {
    public void printArray(T[] array) {
        Arrays.stream(array)
                .forEach(System.out::println);
    }
}
