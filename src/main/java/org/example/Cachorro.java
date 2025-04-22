package org.example;

import java.beans.Beans;

public class Cachorro extends Animal{

    public static void main(String[] args) {

        Cachorro dalmata = new Cachorro();
        Animal  animal = (Animal) new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            System.out.println("cachorro é a instancia da classe Cachorro");
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
//        System.out.print("São iguais? ");
//        System.out.println(Beans.isInstanceOf(cavalo, dalmata.getClass()));


    }

    public void caminhar() {
        System.out.println("Caminhando!");
    }

    public void latir() {
        System.out.println("Au Au");
    }

    public void comer() {
        System.out.println("Comendo!");
    }

    public void dormir() {
        System.out.println("Hora da soneca!");
    }

}
