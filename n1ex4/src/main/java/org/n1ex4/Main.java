package org.n1ex4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> llista = new ArrayList<>();

        llista.add("Gener");
        llista.add("Febrer");
        llista.add("Març");
        llista.add("Abril");
        llista.add("Maig");
        llista.add("Juny");
        llista.add("Juliol");
        llista.add("Agost");
        llista.add("Setembre");
        llista.add("Octubre");
        llista.add("Novembre");
        llista.add("Desembre");

        llista.forEach(System.out::println);
    }
}