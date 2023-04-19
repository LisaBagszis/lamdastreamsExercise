package org.example;

import java.util.function.Function;

public class CountingDuplicates {

    public static void main(String[] args) {

        System.out.println(duplicateCount);

    }

    Function<String, Integer> duplicateCount = (str) -> {
        String name = "Hello World";
        char ch = 'l';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;

    };
}