package org.example;
import java.util.ArrayList;

public class Main {
    //ex 01 foreach em uma lista
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maçã");
        lista.add("Banana");
        lista.add("Goiaba");
        lista.add("Acerola");
        lista.add("Laranja");

        for (String item : lista) {
            System.out.println("Fruta: " + item);
        }

    }
}
