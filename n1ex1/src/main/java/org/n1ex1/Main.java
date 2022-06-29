package org.n1ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> llista = new ArrayList<>();
        llista.add("Hola");
        llista.add("Test");
        llista.add("Ahoy!");
        llista.add("Paraula");
        llista.add("Frase llarga que conté una o");
        llista.add("Onada");

        retornaStringsAmbO(llista);
        retornaStringsAmbOIgnoraMajuscules(llista);
    }

    public static List<String> retornaStringsAmbO(List<String> llista) {

        return llista.stream().filter(s -> s.contains("o")).collect(Collectors.toList());

    }

    public static List<String> retornaStringsAmbOIgnoraMajuscules(List<String> llista) {

        return llista.stream().map(String::toLowerCase).filter(s -> s.contains("o")).collect(Collectors.toList());

    }
}