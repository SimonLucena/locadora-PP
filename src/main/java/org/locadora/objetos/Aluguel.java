package org.locadora.objetos;

import org.locadora.interfaces.AlugavelIntf;

public class Aluguel {
    private final AlugavelIntf alugavel;
    private final int diasAlugado;

    public Aluguel(AlugavelIntf alugavel, int diasAlugado) {
        this.alugavel = alugavel;
        this.diasAlugado = diasAlugado;
    }

    public AlugavelIntf getDVD() {
        return alugavel;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public double getValorAluguel() {
        return alugavel.getValorDvd(diasAlugado);
    }

    public int calcularPontosDeAluguel() {
        return alugavel.getPontosDeAlugadorFrequente(diasAlugado);
    }
}
