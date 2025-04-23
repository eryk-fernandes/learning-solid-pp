package org.example.exercicio2.entity;

import org.example.exercicio2.interfaces.Desconto;

public class ClienteRegular extends Cliente implements Desconto {
    @Override
    public double desconto() {
        return 0.1;
    }
}
