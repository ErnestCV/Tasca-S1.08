package org.n1ex8;

public class Main {
    public static void main(String[] args) {

        ReverseInterface reverseInterface = string -> new StringBuilder(string).reverse().toString();
        System.out.println(reverseInterface.reverse("Hola!"));

        //Comprovat amb un test

    }
}