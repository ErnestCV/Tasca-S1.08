package org.n3ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Alumne> llista = new ArrayList<>();

        llista.add(new Alumne("Ernest", 30, "JAVA", 9));
        llista.add(new Alumne("Marta", 29, "PHP", 10));
        llista.add(new Alumne("Joan", 38, "NODE", 2));
        llista.add(new Alumne("Alicia", 22, "REACT", 5));
        llista.add(new Alumne("Sergi", 32, "JAVA", 8.5f));

        llista.add(new Alumne("Xavier", 17, "JAVA", 9.5f));
        llista.add(new Alumne("Aina", 43, "PHP", 4.5f));
        llista.add(new Alumne("Josep", 16, "NODE", 4));
        llista.add(new Alumne("Laura", 34, "JAVA", 7.5f));
        llista.add(new Alumne("Robert", 19, "ANGULAR", 3));

        //Mostra per pantalla el nom i l’edat de cada alumne/a
        mostraNomEdat(llista);

        //Filtra la llista per tots els alumnes que el seu nom comença per ‘a’
        //Assigna a aquests alumnes a una altra llista i mostra per pantalla la nova llista
        System.out.println(beginsWithA(llista));

        //Filtra i mostra per pantalla els alumnes que tenen una nota de 5 o superior
        mostraNotaMajorIgual5(llista);

        //Filtra i mostra per pantalla els alumnes que tenen un nota de 5 o més, i que no són de PHP
        mostraNotaMajorIgual5NoPHP(llista);

        //Mostra tots els alumnes que fan JAVA i són majors d’edat
        mostraJavaMajorEdat(llista);

    }

    public static void mostraNomEdat(List<Alumne> llista) {
        System.out.println(llista.stream()
                .map(alumne -> Arrays.asList(alumne.getNom(), alumne.getEdat()))
                .map(l -> l.stream().map(String::valueOf).collect(Collectors.joining(": ")))
                .collect(Collectors.toList()));
    }

    public static List<Alumne> beginsWithA(List<Alumne> llista) {
        return llista.stream()
                .filter(alumne -> alumne.getNom().toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
    }

    public static void mostraNotaMajorIgual5(List<Alumne> llista) {
        System.out.println(llista.stream()
                .filter(alumne -> alumne.getNota() >= 5)
                .collect(Collectors.toList()));
    }

    public static void mostraNotaMajorIgual5NoPHP(List<Alumne> llista) {
        System.out.println(llista.stream()
                .filter(alumne -> alumne.getNota() >= 5 && !alumne.getCurs().equals("PHP"))
                .collect(Collectors.toList()));
    }

    public static void mostraJavaMajorEdat(List<Alumne> llista) {
        System.out.println(llista.stream()
                .filter(alumne -> alumne.getCurs().equals("JAVA") && alumne.getEdat() >= 18)
                .collect(Collectors.toList()));
    }
}