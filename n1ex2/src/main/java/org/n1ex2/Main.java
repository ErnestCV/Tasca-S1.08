package org.n1ex2;

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
        llista.add("Oncles");
        llista.add("o o o o o");
        llista.add("o o o o o o");


        System.out.println(retornaStringsAmbO(llista));
        System.out.println(retornaStringsAmbOIgnoraMajuscules(llista));
    }

    public static List<String> retornaStringsAmbO(List<String> llista) {

        return llista.stream().filter(s -> s.contains("o") && comptaLletres(s) > 5).collect(Collectors.toList());

    }

    public static List<String> retornaStringsAmbOIgnoraMajuscules(List<String> llista) {

        return llista.stream().map(String::toLowerCase).filter(s -> s.contains("o") && comptaLletres(s) > 5).collect(Collectors.toList());

    }

    public static long comptaLletres(String str) {

        return str.length() - str.chars().filter(c -> c == (int) ' ').count();
    }
}