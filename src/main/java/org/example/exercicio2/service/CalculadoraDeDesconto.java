package org.example.exercicio2.service;

//Refatore o código para que siga o Princípio Aberto/Fechado

import org.example.exercicio2.interfaces.Desconto;

public class CalculadoraDeDesconto {

    public double calculateDiscount(Desconto desconto) {
        return desconto.desconto();
    }
}
