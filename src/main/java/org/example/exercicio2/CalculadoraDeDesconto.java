package org.example.exercicio2;

//Refatore o código para que siga o Princípio Aberto/Fechado

public class CalculadoraDeDesconto {

    public double calculateDiscount(CategoriaCliente tipoCliente) {
        return tipoCliente.desconto();
    }
}
