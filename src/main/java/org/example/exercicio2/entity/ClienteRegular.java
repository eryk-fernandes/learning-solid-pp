package org.example.exercicio2.entity;

import org.example.exercicio2.interfaces.Descontavel;

public class ClienteRegular extends Cliente implements Descontavel {
    @Override
    public double desconto() {
        return 0.1;
    }
}
