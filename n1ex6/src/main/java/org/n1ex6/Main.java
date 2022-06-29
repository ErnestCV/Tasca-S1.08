package org.n1ex6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> llista = Arrays.asList("1", "Test", "Bola", "3", "String", "5", "Telescopi", "a");

        System.out.println(llista.stream().sorted(Comparator.comparingInt(String::length).thenComparing(String::compareTo)).collect(Collectors.toList()));
    }
}