package org.example.exercicio2.service;

//Refatore o código para que siga o Princípio Aberto/Fechado

import org.example.exercicio2.interfaces.Descontavel;

public class CalculadoraDeDesconto {

    public double calculateDiscount(Descontavel descontavel) {
        return descontavel.desconto();
    }
}
