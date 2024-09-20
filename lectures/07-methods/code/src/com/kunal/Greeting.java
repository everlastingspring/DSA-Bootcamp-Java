package com.kunal;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Greeting {
    public static void main(String[] args) {
        String sentence = "where did you go from your house";
        System.out.println(sortWords(sentence));
    }

    static String sortWords(String sentence) {
       return Arrays.stream(sentence.split(" "))
               .sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()))
                .collect(Collectors.joining(" "));
    }
}
