package org.example.exercicio3.entity;

import org.example.exercicio3.interfaces.Comer;
import org.example.exercicio3.interfaces.Trabalhar;

public class Humano implements Trabalhar, Comer {
    @Override
    public void trabalhar() {
        // Lógica de trabalhar
    }

    @Override
    public void comer() {
        // Lógica de comer
    }
}
