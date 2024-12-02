package org.locadora.classificacao;

public class ClassificacaoLancamento extends Classificacao {

    public int getCodigoPreco() {
        return Classificacao.NORMAL;
    }

    public double getValorDoAluguel(int diasAlugado) {
        return diasAlugado * 3.00;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        int pontosDeAlugadorFrequente = 1;
        if(diasAlugado > 1) {
            pontosDeAlugadorFrequente++;
        }
        return pontosDeAlugadorFrequente;
    }
}
