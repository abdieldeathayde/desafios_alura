package br.com.alura;

public class Circulo implements Forma{

    int raio;

    public Circulo(int raio) {
        this.raio = raio;
    }


    @Override
    public double calcularArea() {
        double pi = 3.14159;
        int raio = 45;


        return pi * raio * raio;




    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(45);
        System.out.println("Área: " + String.format("%.5f", circulo.calcularArea())); //String.format("%.2f", area_circulo)
    }
}
