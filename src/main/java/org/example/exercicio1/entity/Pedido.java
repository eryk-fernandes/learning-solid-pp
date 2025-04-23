package org.example.exercicio1.entity;

//Refatore o código para que a classe Pedido siga o Princípio da Responsabilidade Única.

public class Pedido {

    // Dessa forma o pedido é apenas uma entidade
    // salvar fica no dao, imprimir e calcular ficam nos respectivos services

    String nome;
    double preco;

    public Pedido() {

    }

    // getters e setters

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
