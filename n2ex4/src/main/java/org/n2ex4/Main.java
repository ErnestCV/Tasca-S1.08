package org.n2ex4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> llista = Arrays.asList("1", "Hola", "5", "Cadena de text", "Ernest", "24", "Cadena de prova", "700", "String");

        //Ordenant per:

        //Alfabèticament pel primer caràcter
        System.out.println(llista.stream()
                .sorted()
                .collect(Collectors.toList()));

        //Les cadenes que contenen una "e" primer, la resta de cadenes després
        System.out.println(llista.stream()
                .sorted(Comparator.comparingInt(string -> string.toLowerCase().contains("e") ? 0 : 1))
                .collect(Collectors.toList())); //Primera manera
        System.out.println(llista.stream()
                .collect(Collectors.groupingBy(string -> string.toLowerCase().contains("e") ? 0 : 1))
                .values()
                .stream()
                .flatMap(List::stream)
                .collect(Collectors.toList())); //Segona manera

        //Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’
        System.out.println(llista.stream().map(s -> s.replace("a", "4")).collect(Collectors.toList()));

        //Mostra només els elements que són numèrics
        System.out.println(llista.stream().filter(s -> s.matches("[0-9]+")).collect(Collectors.toList()));

    }
}