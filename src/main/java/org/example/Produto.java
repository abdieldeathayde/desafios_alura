package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}

class Main {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);

        double media = 0;

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Café", 18.50);
        Produto produto2 = new Produto("Leite", 12.50);
        Produto produto3 = new Produto("Feijão", 30.40);

        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        for (Produto produto : produtos) {
            media += produto.getPreco() / produtos.size();


        }

        System.out.print("Média de preços: " + String.format("%.2f", media));


    }
}

