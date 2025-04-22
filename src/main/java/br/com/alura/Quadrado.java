package br.com.alura;

public class Quadrado implements Forma{
    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }


    @Override
    public double calcularArea() {
        int lado = 45;
        return lado * lado;
    }

    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(45);

        System.out.println("Área Quadrado: " + quadrado.calcularArea());


    }
}
