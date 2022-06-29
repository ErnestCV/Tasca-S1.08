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
        ordena1(llista);

        //Les cadenes que contenen una "e" primer, la resta de cadenes després
        ordena2(llista);

        //Modifica tots els elements de la llista que tenen una ‘a’. Modifica la ‘a’ per un ‘4’
        ordena3(llista);

        //Mostra només els elements que són numèrics
        ordena4(llista);

    }

    public static void ordena1(List<String> llista) {
        System.out.println(llista.stream()
                .sorted()
                .collect(Collectors.toList()));
    }

    public static void  ordena2(List<String> llista) {
//        System.out.println(llista.stream()
//                .sorted(Comparator.comparingInt(string -> string.toLowerCase().contains("e") ? 0 : 1))
//                .collect(Collectors.toList())); //Primera manera, només posa les strings amb "e" però no ordena alfabèticament
        System.out.println(llista.stream()
                .collect(Collectors.groupingBy(string -> string.toLowerCase().contains("e") ? 0 : 1))
                .values()
                .stream()
                .map(list -> list.stream().sorted().collect(Collectors.toList()))
                .flatMap(List::stream)
                .collect(Collectors.toList())); //Segona manera, separa amb "e" i no "e", i ordena; després ho junta
    }

    public static void ordena3(List<String> llista) {
        System.out.println(llista.stream().map(s -> s.replace("a", "4")).collect(Collectors.toList()));
    }

    public static void ordena4(List<String> llista) {
        System.out.println(llista.stream().filter(s -> s.matches("\\d+")).collect(Collectors.toList()));
    }
}