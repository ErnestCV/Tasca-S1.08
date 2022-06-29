package org.n2ex1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> llista = Arrays.asList("Ernest", "Joan", "Marta", "Alex", "Ari", "Ali");
        System.out.println(nomsComencenPerATenen3Lletres(llista));

    }

    public static List<String> nomsComencenPerATenen3Lletres(List<String> llista) {

        return llista.stream().filter(s -> s.startsWith("A") && s.length() == 3).collect(Collectors.toList());

    }
}