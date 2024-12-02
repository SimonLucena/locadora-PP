package org.locadora.objetos;

import org.locadora.interfaces.AlugavelIntf;

public class Aluguel {
    private final AlugavelIntf item;
    private final int diasAlugado;

    public Aluguel(AlugavelIntf alugavel, int diasAlugado) {
        this.item = alugavel;
        this.diasAlugado = diasAlugado;
    }

    public AlugavelIntf getAluguel() {
        return item;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public double getValorAluguel() {
        return item.getValorAluguel(diasAlugado);
    }

    public int calcularPontosDeAluguel() {
        return item.getPontosDeAlugadorFrequente(diasAlugado);
    }
}
