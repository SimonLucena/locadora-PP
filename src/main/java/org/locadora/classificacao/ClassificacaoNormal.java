package org.locadora.classificacao;

public class ClassificacaoNormal extends Classificacao {

    public int getCodigoPreco() {
        return Classificacao.NORMAL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugado) {
        double valorDvd = 2.0;
        if(diasAlugado > 2) {
            valorDvd +=(diasAlugado - 2) * 1.5;
        }
        return valorDvd;
    }
}
