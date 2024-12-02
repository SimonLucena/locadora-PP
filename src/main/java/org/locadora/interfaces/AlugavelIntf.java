package org.locadora.interfaces;

import org.locadora.classificacao.Classificacao;

public interface AlugavelIntf {
    public String getTitulo();
    public Classificacao getClassificacao();
    public double getValorAluguel(int diasAlugado);
    public int getPontosDeAlugadorFrequente(int diasAlugado);
}
