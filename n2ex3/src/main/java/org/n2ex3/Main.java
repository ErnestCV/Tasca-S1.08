package org.n2ex3;

public class Main {
    public static void main(String[] args) {

        Operador operadorSuma = (n1, n2) -> n1 + n2;
        Operador operadorResta = (n1, n2) -> n1 - n2;
        Operador operadorMultiplicacio = (n1, n2) -> n1 * n2;
        Operador operadorDivisio = (n1, n2) -> n1 / n2;

        //Exemple de suma
        System.out.println(operadorSuma.operacio(2, 3));

        //Veure classe test

    }
}