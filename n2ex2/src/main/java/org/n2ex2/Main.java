package org.n2ex2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> llista = Arrays.asList(1, 2, 14, 57, 286);
        System.out.println(checkOddEven(llista));

        //Comprovat amb test
    }

    public static String checkOddEven(List<Integer> llista) {

        return llista.stream().map(integer -> integer % 2 == 0 ? "e" + integer.toString() : "o" + integer.toString()).collect(Collectors.joining(", "));

    }
}